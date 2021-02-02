package test.ch19;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Address {
    public static void main(String[] args) {
        InetAddress ip;
        try {
            ip = InetAddress.getLocalHost();
            String name = ip.getHostName();
            String address=ip.getHostAddress();
            System.out.println(name);
            System.out.println(address);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
