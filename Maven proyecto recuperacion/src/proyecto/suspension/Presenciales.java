package proyecto.suspension;

public class Presenciales extends Estudiante{
	protected String codigoAula;

	public String getCodigoAula() {
		return codigoAula;
	}

	public void setCodigoAula(String codigoAula) {
		this.codigoAula = codigoAula;
	}

	@Override
	public String toString() {
		return "Presenciales [codigoAula=" + codigoAula + "]";
	}

}
