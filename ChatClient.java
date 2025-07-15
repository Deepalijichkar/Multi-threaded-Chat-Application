import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000);
             BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("🟢 Connected to chat server.");
            System.out.println("💬 Type your messages below:\n");

            // Receive messages from server in a new thread
            new Thread(() -> {
                try {
                    String serverMsg;
                    while ((serverMsg = input.readLine()) != null) {
                        System.out.println(serverMsg);
                    }
                } catch (IOException e) {
                    System.out.println("❌ Disconnected from server.");
                }
            }).start();

            // Send messages to the server
            String userInput;
            while ((userInput = console.readLine()) != null) {
                output.println(userInput);
            }

        } catch (IOException e) {
            System.out.println("❌ Could not connect to server: " + e.getMessage());
        }
    }
}
