public class Vehicle {
	public static final String BASIC = "basic";
	public static final String GENERAL = "general";
	public static final String LUXE = "luxe";
	
	private String model;
	private String marca;
	private String categoria;

	public Vehicle(String marca, String model, String categoria) {
		this.setMarca(marca);
		this.setModel(model);
		this.setCategoria(categoria);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}
