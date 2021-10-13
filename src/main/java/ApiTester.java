import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class ApiTester {
    public static void main(String[] args) throws UnirestException {
        String s = Unirest.get("http://localhost:8080/it3_E21_web_war/rest/patient").asString().getBody();
        System.out.println(s);
    }
}
