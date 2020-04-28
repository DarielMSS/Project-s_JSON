import com.fasterxml.jackson.databind.*;
import java.io.*;

public class demo {

	public static void main(String[] args) {

		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);

		try {
			Patient patient = new Patient();

			patient.setFirstName("Dariel");
			patient.setLastName("Moura");
			patient.setDateOfBirth("1995-12-28");
			patient.setAddress("rua interlagos");
			patient.setCity("Alvorada");
			patient.setState("34");
			patient.setZip("54321");
			patient.setPhone("984002573");

			mapper.writeValue(new File("writePatient.JSON"), patient);

		} catch (IOException e) {
			e.printStackTrace();

		}

	}

}
