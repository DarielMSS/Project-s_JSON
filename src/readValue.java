import com.fasterxml.jackson.databind.*;


import java.io.*;




public class readValue {

	public static void main(String[] args) {
		
		
		ObjectMapper mapper = new  ObjectMapper();
		
		
		try {
			
			Patient patient = mapper.readValue(new File("Patient.JSON"), Patient.class);
					
			System.out.println(patient.getFirstName()+""+patient.getLastName());
			System.out.println(patient.toString());
			
		}catch (IOException e) {}
		
		

	}

}
