package helloNet;

import java.io.*;
import java.net.*;
class Client implements Runnable{
    Socket s;
    Client(Socket a){s=a;}
    public void run(){
        BufferedReader sin = null;
        PrintWriter sout= null;
        String str="",end="\r\n\r\n";
        boolean flag=true;
        int n=0;
        try{
        sin=new BufferedReader(new InputStreamReader(s.getInputStream()));
        sout=new PrintWriter(s.getOutputStream());
        while(flag){
            n=sin.read();
            str+=(char)n;
            if(str.endsWith(end))flag=false;
        }
        System.out.println(str);
        sout.print("Request has been recieved and noted duly.");
        s.close();
        }catch(IOException e){e.printStackTrace();}
    }
}
