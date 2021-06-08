package hsiuying.Net;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Test {
    public static void main(String[] args) {
        //TELNET, RFC 854
        try{
            Socket socket = new Socket("ptt.cc",23);
            InputStream is = socket.getInputStream();
            for (int i = 0; i < 500; i++) {
                int data = is.read();
                System.out.println((char) data);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
