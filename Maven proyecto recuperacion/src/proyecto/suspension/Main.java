package proyecto.suspension;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaOpcion = new Scanner(System.in);
		Scanner entradaOpcion1 = new Scanner(System.in);
		Scanner entradaCaracter = new Scanner(System.in);
		int opcion;
		Estudiante estudiantes[] = new Estudiante[0];
		Presenciales estudiantePresencial1 = new Presenciales();
		Virtuales estudianteVirtual1 = new Virtuales();
		int posicionVector = 0;
		
		do {
		System.out.println("Bienvenido a la Universidad Central");
		System.out.println("Que desea hacer");
		System.out.println("1. Ingresar estudiante");
		System.out.println("2. Consultar estudiante");
		System.out.println("3. Salir");
		opcion = entradaOpcion.nextInt();
		
			switch (opcion) {
			//ingresar
			case 1:
				Estudiante ingresoEstudiante = new Estudiante();
				Estudiante arrayTemporal[] = new Estudiante[estudiantes.length + 1];
				for (int i = 0; i < estudiantes.length; i++) {
					arrayTemporal[i] = estudiantes[i];
				}
				
				System.out.println("Ingrese el codigo matricula: ");
				String codigoMatricula = entradaCaracter.nextLine();
				ingresoEstudiante.setCodigoMatricula(codigoMatricula);
				System.out.println("Ingrese el nombre: ");
				String nombre = entradaCaracter.nextLine();
				ingresoEstudiante.setNombre(nombre);
				System.out.println("Ingrese el apellido: ");
				String apellido = entradaCaracter.nextLine();
				ingresoEstudiante.setApellido(apellido);
				System.out.println("Ingrese la fecha de matricula: ");
				String fechaMatricula = entradaCaracter.nextLine();
				ingresoEstudiante.setFechaMatricula(fechaMatricula);
				String codigoAula;
				String plataformaTecnologica;
				
				System.out.println("Ingrese que tipo de estudiante es: ");
				System.out.println("1. Presencial");
				System.out.println("2. Virtual");
				String opcionTipoEstudiante = entradaOpcion1.nextLine();
				if (opcionTipoEstudiante.equals("1")) {
					System.out.println("Ingrese el codigo de aula: ");
					codigoAula = entradaCaracter.nextLine();
					estudiantePresencial1.setCodigoAula(codigoAula);
				}else if (opcionTipoEstudiante.equals("2")) {
					System.out.println("Ingrese la plataforma tecnologica: ");
					plataformaTecnologica = entradaCaracter.nextLine();
					estudianteVirtual1.setPlataformaTecnologica(plataformaTecnologica);
				}
				arrayTemporal[posicionVector] = ingresoEstudiante;
				estudiantes=arrayTemporal;
				posicionVector++;
				System.out.println("El estudiante fue matriculado");				
			break;
				
			case 2:
			//consultar
				System.out.println("Ingrese el codigo de matricula del estudiante a consultar: ");
				String codigoMatriculaBuscar = entradaCaracter.nextLine();
				System.out.println("Ingrese el apellido del estudiante a consultar: ");
				String apellidoBuscar = entradaCaracter.nextLine();
				
				for (int i = 0; i < estudiantes.length; i++) {
					Estudiante busquedaEstudiante = estudiantes[i];
					
					boolean buscar = busquedaEstudiante.getCodigoMatricula().equals(codigoMatriculaBuscar);
					boolean buscar2 = busquedaEstudiante.getApellido().equals(apellidoBuscar);

					if (buscar == true || buscar2 == true) {
						System.out.println("Se encontro al estudiante");
						System.out.println("Se va a imprimir el reporte");
						System.out.println("Codigo de matricula: " +estudiantes[i].getCodigoMatricula()+
								" -Nombre: "+ estudiantes[i].getNombre()+" -Apellido: "
								+estudiantes[i].getApellido()+" -Fecha de Matricula: "
								+estudiantes[i].getFechaMatricula());
					}				
				}
			break;
			}
		
		}while(opcion<=2);
	}

}
