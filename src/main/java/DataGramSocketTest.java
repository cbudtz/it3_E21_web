import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class DataGramSocketTest {
    public static void main(String[] args) {
        try {
            DatagramSocket datagramSocket = new DatagramSocket(5000);
            DatagramPacket datagramPacket = new DatagramPacket(new byte[10], 10);
            datagramSocket.receive(datagramPacket);
            InetAddress address = datagramPacket.getAddress();
            System.out.println(address);

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
