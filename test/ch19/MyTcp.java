package test.ch19;

import java.io.*;
import java.io.BufferedReader;
import java.nio.Buffer;
import java.net.*;

public class MyTcp {
    private BufferedReader reader;
    private ServerSocket serverSocket;
    private Socket socket;

    void getserver() {
        try {
            serverSocket = new ServerSocket(8998);
            while (true) {
                System.out.println("wait link");
                socket = serverSocket.accept();
                reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                getMessage();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void getMessage(){
        try {
            while (true) {
                System.out.println("custom:"+reader.readLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (reader!=null) {
                reader.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (socket!=null) {
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        MyTcp tcp = new MyTcp();
        tcp.getserver();
    }
}
