package test.ch19;

import java.net.*;

public class Weather extends Thread {
    String weather = "sun";
    int port = 9898;
    InetAddress ip = null;
    MulticastSocket socket = null;

    Weather() {
        try {
            ip = InetAddress.getByName("224.255.10.0");
            socket = new MulticastSocket(port);
            socket.setTimeToLive(1);
            socket.joinGroup(ip);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void run() {
        while (true) {
            DatagramPacket packet = null;
            byte data[] = weather.getBytes();
            packet = new DatagramPacket(data, data.length, ip, port);
            System.out.println(new String(data));
            try {
                socket.send(packet);
                sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
    }

    public static void main(String[] args) {
        Weather w = new Weather();
        w.start();
    }
}
