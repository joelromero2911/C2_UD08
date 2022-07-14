public class Electrodomestico {
	
	protected final float PRECIO_BASE = 100;
	protected final String COLOR = "blanco";
	protected final char CONSUMO_ENERGETICO = 'F';
	protected final float PESO = 5;
	
	protected float precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected float peso;
	
	public Electrodomestico() {
		
		this.precioBase = this.PRECIO_BASE;
		this.color = this.COLOR;
		this.consumoEnergetico = this.CONSUMO_ENERGETICO;
		this.peso = this.PESO;
	}
	
	public Electrodomestico(float precioBase, float peso) {
		
		this.precioBase = precioBase;
		this.color = this.COLOR;
		this.consumoEnergetico  = this.CONSUMO_ENERGETICO;
		this.peso = peso;
	}
	
	public Electrodomestico(float precioBase, String color, char consumoEnergetico, float peso) {

		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}
	
	public char comprobarConsumoEnergetico(char letra) {
		
		char[] letras = {'A', 'B', 'C', 'D', 'E', 'F'};
		boolean contains = false;
		
		for (char c : letras) {
		    if (c == letra) {
		        contains = true;
		        this.consumoEnergetico = letra; 
		        break;
		    }
		}
		if (!contains) {
			this.consumoEnergetico = 'F'; 
		}
		return letra;
	}
	
	public String comprobarColor(String color) {
		
		String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
		boolean contains = false;
		color = color.toLowerCase();
		
		for (String c : colores) {
		    if (c.equals(color)) {
		        contains = true;
		        this.color = color; 
		        break;
		    }
		}
		if (!contains) {
			this.consumoEnergetico = 'F'; 
		}
		return color;
	}
	
	public float getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(float precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
}