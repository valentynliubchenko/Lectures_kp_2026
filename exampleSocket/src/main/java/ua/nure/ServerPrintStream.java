package ua.nure;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerPrintStream
{
    public static void main( String[] args )  {
        System.out.println( "Server starting!" );
        int port = 8080;
        try (ServerSocket serverSocket = new ServerSocket( port )) {
            Socket socket =serverSocket.accept();
            PrintStream out = new PrintStream( socket.getOutputStream(), true , "UTF-8");
            out.flush();
            out.println( "Привіт Моє повідомлення My message!" );
            System.out.println( "Client conected!" );
            System.out.println( "Message was sent!" );

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
