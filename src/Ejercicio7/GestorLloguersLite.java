import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GestorLloguersLite {
	
	public GestorLloguersLite() {}
	
	public Lloguer nouLloguer(String fecha, Integer dias, String categoria) throws ParseException {		
		// demostració de construcció d'un vehicle de categoria BASIC
		Vehicle vehicleBasic = new Vehicle("Tata", "Vista", categoria);
	
		// demostració de construccuó d'un lloguer amb una data
		SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
		Date date = dateFormat.parse(fecha);
		Lloguer lloguerBasic = new Lloguer(date, dias, vehicleBasic);
	
		// demostració de formatat d'una data
		System.out.println(dateFormat.format(lloguerBasic.getData()));
		
		return lloguerBasic;
	}
}
