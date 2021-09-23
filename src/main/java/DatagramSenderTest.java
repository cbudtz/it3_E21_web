import java.io.IOException;
import java.net.*;

public class DatagramSenderTest {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(5001);
        DatagramPacket datagramPacket = new DatagramPacket(new byte[10], 10, InetAddress.getByName("192.168.1.169"),5000);
        datagramSocket.send(datagramPacket);
    }
}
