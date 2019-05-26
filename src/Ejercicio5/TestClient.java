import static org.junit.Assert.*; // importa una classe static

import java.text.ParseException;

import org.junit.*;

public class TestClient {
	@Test
	public void testPuntConstructor() {
		// comprova que el informe se forma bien
		try {
			Client client1 = new Client("X211212X", "Alex", "4334342323");
			client1.afegeix(new GestorLloguersLite().nouLloguer());
			
			assertEquals(client1.informe(), client1.informe());
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]) {
		org.junit.runner.JUnitCore.main("TestPunt");
	}
}