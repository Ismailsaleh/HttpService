package httpserver;



import java.net.ServerSocket;
import java.net.Socket;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ismail
 */
public class Testserver {

    public Testserver() {
    
     
    try{
              ServerSocket welcomeSocket = new ServerSocket(6789);
            while(true){
                Socket connectionSocket = welcomeSocket.accept();
                Sockethttp si = new Sockethttp(connectionSocket);
                si.run();
    }
    
    }catch(Exception e){
    
}
    }}