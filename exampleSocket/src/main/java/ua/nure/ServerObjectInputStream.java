package ua.nure;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerObjectInputStream {
    public static void main(String[] args) {
        System.out.println("Server ServerObjectInputStream starting!");
        int port = 8083;
        while (true) {
            try (ServerSocket serverSocket = new ServerSocket(port)) {
                while (true) {
                    Socket socket = serverSocket.accept();

                    ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                    try {
                        Object object = ois.readObject();
                        System.out.println("Read");
                        if (object instanceof Person) {
                            Person person = (Person) object;
                            System.out.println("person received: " + person);
                        }
                        System.out.println("Finish");

                    } catch (ClassNotFoundException e) {

                        e.printStackTrace();
                    } catch (IOException e) {
                        System.out.println("IO Exception: connect closed");
                        e.printStackTrace();
                    }

                    System.out.println("Client conected!");

                }

            } catch (IOException e) {
                System.out.println("IO Exception 2: connect closed");
            }
        }
    }
}
