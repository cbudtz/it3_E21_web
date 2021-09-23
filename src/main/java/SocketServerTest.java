import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class SocketServerTest {
    public static void main(String[] args) {
        try {

            ServerSocket serverSocket = new ServerSocket(9876);
            Socket activeSocket = serverSocket.accept();
            System.out.println("Speaking to client on: " + activeSocket.getPort());

            InputStream inputStream = activeSocket.getInputStream();
            OutputStream outputStream = activeSocket.getOutputStream();


            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String s;
            do {
                s = bufferedReader.readLine();
                System.out.println(s);
            } while (!s.isEmpty());

            PrintWriter printWriter = new PrintWriter(outputStream);
            printWriter.print("HTTP/1.1 200\r\n");
            printWriter.print("\r\n");
            printWriter.print("Test\r\n");
            printWriter.close();

            activeSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
