package chapter_17;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.time.format.FormatStyle;
import java.util.concurrent.TimeUnit;

import static java.time.LocalDateTime.now;
import static java.time.format.DateTimeFormatter.ofLocalizedTime;

public class PingingClient {
    public static void main(String[] args) {
        InetSocketAddress server = new InetSocketAddress("127.0.0.1", 6000);

        try(SocketChannel channel = SocketChannel.open(server)) {
            PrintWriter writer = new PrintWriter(Channels.newWriter(channel, StandardCharsets.UTF_8));
            System.out.println("Networking established");

            for (int i = 0; i<10; i++){
                String message = "ping " + i;
                writer.println(message);
                writer.flush();

                String currentTime = now().format(ofLocalizedTime(FormatStyle.MEDIUM));
                System.out.println(currentTime + " Sent " + message);
                TimeUnit.SECONDS.sleep(1);
            }

        }catch (IOException | InterruptedException e){
            e.printStackTrace();
        }
    }
}
