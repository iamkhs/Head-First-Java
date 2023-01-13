package chapter_17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleChatServer {
    private final ArrayList<PrintWriter> clientWriters = new ArrayList<>();

    public static void main(String[] args) {
        new SimpleChatServer().go();
    }

    private void go(){
        ExecutorService threadPool = Executors.newCachedThreadPool();
        try {
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.bind(new InetSocketAddress(6000));

            while(serverSocketChannel.isOpen()){
                SocketChannel clientSocket = serverSocketChannel.accept();
                PrintWriter writer = new PrintWriter(Channels.newWriter(clientSocket, StandardCharsets.UTF_8));
                clientWriters.add(writer);
                threadPool.submit(new ClientHandler(clientSocket));
                System.out.println("got a connection");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private void tellEveryone(String message){
        for (PrintWriter writer : clientWriters){
            writer.println(message);
            writer.flush();
        }
    }

    public class ClientHandler implements Runnable{
        BufferedReader reader;
        SocketChannel socket;

        public ClientHandler(SocketChannel clientSocket){
            socket = clientSocket;
            reader = new BufferedReader(Channels.newReader(socket,StandardCharsets.UTF_8));
        }

        public void run(){
            String message;
            try {
                while ((message = reader.readLine()) != null){
                    if (!message.isEmpty()){
                        System.out.println("read: "+ message);
                        tellEveryone(message);
                    }
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
