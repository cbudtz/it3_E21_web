import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("patient")
@Produces(MediaType.APPLICATION_XML)
public class AhoyService {
    @GET
    public Patient getPatient() throws JsonProcessingException {
        Patient patient = new Patient();
        patient.setCpr("123456-xxxx");
        patient.setName("TestBruger");
        return patient;
    }
}
