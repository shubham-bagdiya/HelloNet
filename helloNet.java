package helloNet;
import java.net.*;
import java.util.Scanner;
import java.io.*;
class helloNet implements Runnable{

private int port,instance;
private String name;
private boolean on;

helloNet(){
port = 80;
instance=1;
name="Random BS";
}
public void run(){
    ServerSocket ss = null;
    try{
    ss=new ServerSocket(port);
    on=true;
    while(on){
        Thread t =new Thread(new Client(ss.accept()));
        t.start();
    }
    }catch(IOException e){e.printStackTrace();}
}
public static void main(String[] args){
Thread t =new Thread(new helloNet());
t.start();
System.out.println("Server has been started...");
}
}
