import static org.junit.Assert.*; // importa una classe static

import java.text.ParseException;

import org.junit.*;

public class TestClient {
	@Test
	public void testInforme() {
		// comprova que el informe se forma bien
		try {
			Client client1 = new Client("X211212X", "Alex", "4334342323");
			client1.afegeix(new GestorLloguersLite().nouLloguer("12/8/2018", 1, Vehicle.BASIC));			
			assertEquals(client1.informe(), client1.informe());
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testInformeX2() {
		// comprova que el informe se forma bien con 2 alquileres
		try {
			Client client1 = new Client("X211212X", "Alex", "4334342323");
			client1.afegeix(new GestorLloguersLite().nouLloguer("12/8/2018", 1, Vehicle.BASIC));			
			client1.afegeix(new GestorLloguersLite().nouLloguer("14/8/2018", 1, Vehicle.GENERAL));			
			assertEquals(client1.informe(), client1.informe());
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testInformeGeneral() {
		// comprova que el informe se forma bien
		try {
			Client client1 = new Client("X211212X", "Alex", "4334342323");
			client1.afegeix(new GestorLloguersLite().nouLloguer("12/8/2018", 2, Vehicle.GENERAL));			
			assertEquals(client1.informe(), client1.informe());
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testInformeLuxe() {
		// comprova que el informe se forma bien
		try {
			Client client1 = new Client("X211212X", "Alex", "4334342323");
			client1.afegeix(new GestorLloguersLite().nouLloguer("12/8/2018", 1, Vehicle.LUXE));			
			assertEquals(client1.informe(), client1.informe());
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]) {
		org.junit.runner.JUnitCore.main("TestPunt");
	}
}