package zad2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class JavaUdpServer {

    public static void main(String args[])
    {
        System.out.println("JAVA UDP SERVER");
        DatagramSocket socket = null;
        int serverPortNumber = 9008;

        try{
            socket = new DatagramSocket(serverPortNumber);
            byte[] buffer = new byte[1024];

            while(true) {
                Arrays.fill(buffer, (byte)0);
                DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);
                socket.receive(receivePacket);
                String msg = new String(receivePacket.getData());
                System.out.println("received msg: " + msg);

                byte[] sendBuff = msg.getBytes();
                sendBuff = ByteBuffer.allocate(sendBuff.length).order(ByteOrder.LITTLE_ENDIAN).put(sendBuff).array();
                DatagramPacket sendPacket = new DatagramPacket(sendBuff, sendBuff.length, receivePacket.getAddress(), receivePacket.getPort());
                socket.send(sendPacket);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            if (socket != null) {
                socket.close();
            }
        }
    }
}
