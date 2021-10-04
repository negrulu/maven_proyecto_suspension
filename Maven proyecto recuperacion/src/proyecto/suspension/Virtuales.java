package proyecto.suspension;

public class Virtuales extends Estudiante{
	protected String plataformaTecnologica;

	public String getPlataformaTecnologica() {
		return plataformaTecnologica;
	}

	public void setPlataformaTecnologica(String plataformaTecnologica) {
		this.plataformaTecnologica = plataformaTecnologica;
	}

	@Override
	public String toString() {
		return "Virtuales [plataformaTecnologica=" + plataformaTecnologica + "]";
	}

	
}
