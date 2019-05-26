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
	
	public static double quantitat(Lloguer lloguer) {
		Double quantitat = 0.0;
		switch (lloguer.getVehicle().getCategoria()) {
		case Vehicle.BASIC:
			quantitat += 3;
			if (lloguer.getDies() > 3) {
				quantitat += (lloguer.getDies() - 3) * 1.5;
			}
			break;
		case Vehicle.GENERAL:
			quantitat += 4;
			if (lloguer.getDies() > 2) {
				quantitat += (lloguer.getDies() - 2) * 2.5;
			}
			break;
		case Vehicle.LUXE:
			quantitat += lloguer.getDies() * 6;
			break;
		}
		
		return quantitat;
	}
}
