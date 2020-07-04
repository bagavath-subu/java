package server.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerChat {
   public static void main(String[] args) {
       try{
           ServerSocket s=new ServerSocket(9999);
           Socket soc=s.accept();
           BufferedReader br= new BufferedReader(new InputStreamReader(soc.getInputStream()));
           String tmp= br.readLine();
           System.out.print("Recieved:"+tmp);
           PrintStream pr=new PrintStrem(soc.getOutputStream());
           String str="hi";
       pr.println(str);
       }
       catch(Exception e){
           
       }
    }
}
