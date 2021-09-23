import java.io.*;
import java.net.Socket;

public class SocketClientTest {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",9876);
        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);
        printWriter.println("Ohøj");
        printWriter.println("");
        printWriter.flush();

        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);
    }
}
