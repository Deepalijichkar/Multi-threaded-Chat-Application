# Multi-threaded-Chat-Application

"COMPANY": CODTECH IT SOLUTIONS

"NAME": DEEPALI JICHKAR

"INTERN ID": CT04DM706

"DOMAIN": JAVA

"DURATION": 4 WEEKS

"MENTOR": NEELA SANTOSH

In this task, I developed a multi-threaded chat application in Java, designed to demonstrate socket programming and real-time communication between multiple users. This project involves building both the server-side and client-side components using Java sockets and multi-threading to handle multiple client connections simultaneously. The primary goal was to create a simple, functional, and scalable chat system where any number of clients could connect to a server and exchange messages in real time.

The application consists of two main Java files: ChatServer.java and ChatClient.java. The server is responsible for accepting incoming client connections, managing those connections using threads, and broadcasting messages from any one client to all other connected clients. For every new client that connects to the server, a new thread is spawned to handle that specific client. This is done using Java’s threading model to allow concurrent communication without blocking the main server flow.

On the client side, the ChatClient.java program allows the user to connect to the server and send or receive messages in real time. As soon as a client connects, it starts a background thread to listen for messages from the server continuously. This ensures that the client can send and receive messages independently and simultaneously, providing a real-time chat experience.

For example, if two clients are running and both send messages, those messages are relayed to all connected clients via the server, creating a group chat effect. Each client sees the messages as they are sent, tagged with the sender’s socket port number (which acts as a temporary ID). The server does not store messages — it only relays them while clients are active.

The project was developed and executed using Visual Studio Code (VS Code) as the IDE. All terminals were opened within VS Code for seamless compilation and execution. The server was started in one terminal using java ChatServer, and the clients were run in separate terminal instances using java ChatClient. Each client displayed a prompt where users could type and send messages, which were instantly broadcast to all others.

From a learning perspective, this task was very useful in understanding how network communication works in Java. I gained practical experience with:

Java Socket API (ServerSocket, Socket)

Input and Output Streams (BufferedReader, PrintWriter)

Multi-threading with Thread classes

Synchronization of shared resources

Real-time application logic and communication

In addition to technical learning, I also understood the importance of handling multiple clients safely and efficiently in a networked environment. I encountered and resolved issues like “connection refused” errors when clients were started before the server, and learned to troubleshoot using terminal outputs.

This task clearly demonstrated how powerful Java is when it comes to building scalable network applications. With simple socket programming and threads, I was able to create a working real-time chat system that multiple users could access without crashing or delay.

In conclusion, Task 3 helped me solidify my understanding of multi-threaded server-client architecture and provided hands-on experience with core Java networking features. The final deliverable is a functional chat application that supports real-time, bidirectional communication among any number of connected clients.


#output


<img width="1180" height="512" alt="Image" src="https://github.com/user-attachments/assets/277f3e35-b643-444b-88cb-6360b3e60970" />

<img width="730" height="443" alt="Image" src="https://github.com/user-attachments/assets/2e0ef2a9-872d-4670-a582-568a4b6a6f55" />


