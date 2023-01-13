package chapter_17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

public class DailyAdviceClient {
    public void go() {
        // define the server address as being port 500, on the same host this code is running on the "localhost"
        InetSocketAddress serverAddress = new InetSocketAddress("127.0.0.1", 6000);
        try(SocketChannel socketChannel = SocketChannel.open(serverAddress)){// create a socket channel by opening one for the server's address

            // Create a Reader that reads from the SocketChannel
            Reader channelReader = Channels.newReader(socketChannel, StandardCharsets.UTF_8);

            // Chain a BufferedReader to the Reader from the SocketChannel
            BufferedReader reader = new BufferedReader(channelReader);

            // This readLine() is EXACTLY the same as if you were using a BufferedReader chained to a FILE
            String advice = reader.readLine();
            System.out.println("Today you should: " + advice);

            reader.close(); // this closes the channelReader and this BufferedReader
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new DailyAdviceClient().go();
    }
}
