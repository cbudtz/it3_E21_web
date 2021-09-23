
import java.io.*;

public class FileWriterTest {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println(s);

        File file = new File("test.txt");
        OutputStream fileOutputStream= new FileOutputStream(file);

        PrintWriter printWriter = new PrintWriter(fileOutputStream);
        printWriter.println(s);
        printWriter.flush();
        PrintStream printStream = new PrintStream(System.out);
        new PrintWriter(printStream);

        FileInputStream fileInputStream = new FileInputStream("index.html");
        fileInputStream.transferTo(fileOutputStream);
    }
}
