/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package client.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ClientChat {

    public static void main(String[] args) {
 
        try{
            Socket s= new Socket("localhost",9999);
           PrintStream pr= new PrintStream(s.getOutputStream());
           System.out.print("Enter something:");
           InputStreamReader r=new InputStreamReader(System.in);
           BufferedReader br=new BufferedReader(r);
           String tmp=br.readLine();
           pr.println(tmp);
          BufferedReader br1= new BufferedReader(new InputStreamReader(s.getInputStream()));
          String str=br1.readLine();
          System.out.print(str);        }        
catch(Exception e){
            
        }
    }
}
