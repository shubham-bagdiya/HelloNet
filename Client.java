package helloNet;
import java.io.*;
import java.net.*;
class Client implements Runnable{
    Socket s;
    Client(Socket a){s=a;}
    public void run(){
        BufferedReader sin = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter sout= new PrintWriter(s.getOutputStream());
        String str="\n\r\n\r";
        boolean flag=true;
        while(flag){}
    }
}