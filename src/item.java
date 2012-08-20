
public class item {
	private double peso;
	private int nivelPrioridad;
	
	public item(int peso, int nivelPrioridad) {
		this.peso = peso;
		this.nivelPrioridad = nivelPrioridad;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getNivelPrioridad() {
		return nivelPrioridad;
	}
	public void setNivelPrioridad(int nivelPrioridad) {
		this.nivelPrioridad = nivelPrioridad;
	}
	
	@Override
	public boolean equals(Object obj) {	
		item b = (item) obj;
		
		if(b.getPeso() != this.peso || b.getNivelPrioridad() != this.nivelPrioridad) return false;

		return true;
	}
	
	@Override
	public String toString() {
		return "[" + this.peso + "," + this.nivelPrioridad + "]";
	}
	
}
