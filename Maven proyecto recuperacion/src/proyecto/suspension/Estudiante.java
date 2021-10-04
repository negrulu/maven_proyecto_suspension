package proyecto.suspension;

public class Estudiante {
	protected String codigoMatricula;
	protected String nombre;
	protected String apellido;
	protected String fechaMatricula;
	
	public String getCodigoMatricula() {
		return codigoMatricula;
	}
	public void setCodigoMatricula(String codigoMatricula) {
		this.codigoMatricula = codigoMatricula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getFechaMatricula() {
		return fechaMatricula;
	}
	public void setFechaMatricula(String fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}
	
	@Override
	public String toString() {
		return "Estudiante [codigoMatricula=" + codigoMatricula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fechaMatricula=" + fechaMatricula + "]";
	}
	

}
