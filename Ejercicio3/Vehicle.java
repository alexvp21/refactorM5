public class Vehicle {
	public static final Integer BASIC = 0;
	public static final Integer MIG = 1;
	public static final Integer PREMIUM = 2;
	
	private String model;
	private String marca;
	private String categoria;
	private Integer tipo;
	
	public Vehicle(String marca, String model, String categoria) {
		this.setMarca(marca);
		this.setModel(model);
		this.setCategoria(categoria);
	}

	public Vehicle(String marca, String model, Integer tipo) {
		this.setMarca(marca);
		this.setModel(model);
		this.setTipo(tipo);
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

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
}
