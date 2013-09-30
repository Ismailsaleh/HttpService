package httpserver;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ismail
 */
public class Sockethttp {

    Socket connectionSocket;

    public Sockethttp(Socket connection) {
        connectionSocket = connection;
    }

    public void run() {

        try {
            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            
            PrintStream outToClient = new PrintStream(
                
            connectionSocket.getOutputStream());
            String clientSentence = inFromClient.readLine();
            System.out.println("FROM CLIENT: " + clientSentence);
            String capitalizedSentence = clientSentence.toUpperCase();
            outToClient.println(capitalizedSentence);
        } catch (Exception e) {
            e.printStackTrace();
        }








    }
}
