package chapter_17;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Random;

public class DailyAdviceServer {
    final private String[] adviceList = {
            "Take smaller bites",
            "Go for the tight jeans. No they do NOT make you look fat",
            "One word: inappropriate",
            "Just for today, be honest. Tell your boss what you *really* think.",
            "You might want to rethink that haircut."
    };

    private final Random random = new Random();

    public void go(){
        // SeverSocketChannel makes this server application "listen" for client request on the port it's bound to.
        try(ServerSocketChannel serverChannel = ServerSocketChannel.open()){
            // You have to bind the ServerSocketChannel to  the port you want to run the application on
            serverChannel.bind(new InetSocketAddress(6000));

            // This server goes into a permanent loop, waiting for client request
            while(serverChannel.isOpen()){
                // The accept method blocks until a request comes in,
                // and then the method returns a SocketChannel for communicating with the client
                SocketChannel clientChannel = serverChannel.accept();

                /*
                Create an output stream for the client's channel,
                and wrap it in a PrintWrite. You can use newOutputStream or newWrite here.
                 */
                PrintWriter writer = new PrintWriter(Channels.newOutputStream(clientChannel));

                String advice = getAdvice();
                writer.println(advice); // Send the client a String advice message
                writer.close(); // close the writer, which will also close the client SocketChannel.
                System.out.println(advice);
            }

        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    private String getAdvice(){
        int nextAdvice = random.nextInt(adviceList.length);
        return adviceList[nextAdvice];
    }

    public static void main(String[] args) {
        new DailyAdviceServer().go();
    }
}

