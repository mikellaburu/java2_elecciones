import java.util.Scanner;

public class Elecciones {

	public static void main(String[] args) {
	
		Scanner tecla=new Scanner(System.in);
		
		String opcion=" ";
		System.out.println("ELECCIONES");
		
		do{
			System.out.println("Elige una opcion (a-e), o teclea 'X' para terminar:");
			opcion=tecla.next();
			switch (opcion){
				case "a": 
					String nombre=" ";
					String apellido1=" ";
					String apellido2=" ";
					String dni=" ";
					int edad=0;
					boolean mayor=false;
					String genero=" ";
					String direccion=" ";
					long fijo=0;
					long movil=0;
					
					System.out.println("DATOS DEL HABITANTE");
					System.out.println(" ");
					System.out.println("Ingresa tus datos");
					System.out.print("Nombre: ");
					nombre=tecla.next();
					System.out.print("Primer apellido: ");
					apellido1=tecla.next();
					System.out.print("Segundo apellido: ");
					apellido2=tecla.next();
					System.out.print("DNI: ");
					dni=tecla.next();
					System.out.print("Edad: ");
					edad=tecla.nextInt();
					System.out.print("Genero: ");
					genero=tecla.next();
					System.out.print("Direccion: ");
					direccion=tecla.next();
					System.out.print("Telefono fijo: ");
					fijo=tecla.nextLong();
					System.out.print("Telefono movil: ");
					movil=tecla.nextLong();
					
					Habitante h1=new Habitante();
					h1.setNombre(nombre);
					h1.setApellido1(apellido1);
					h1.setApellido2(apellido2);
					h1.setDni(dni);
					h1.setEdad(edad);
					h1.setSexo(genero);
					h1.setDireccion(direccion);
					h1.setFijo(fijo);
					h1.setMovil(movil);
					
					
					System.out.println("Datos introducidos del  habitante");
					System.out.println("Nombre: "+h1.getNombre());
					System.out.println("Apellido 1: "+h1.getApellido1());
					System.out.println("Apellido 2: "+h1.getApellido2());
					System.out.println("DNI: "+h1.getDni());
					System.out.println("Edad: "+h1.getEdad());
					if (h1.getMayor()){
						System.out.println("El habitante es mayor de edad. ");
					}else{
						System.out.println("El habitante es menor.");
					}
					System.out.println("Genero: "+h1.getSexo());
					System.out.println("Direccion: "+h1.getDireccion());
					System.out.println("Fijo: "+h1.getFijo());
					System.out.println("Movil: "+h1.getMovil());
					break;
				
				case "b":
					System.out.println("Ayuntamiento");
					break;
				
				case "c":
					System.out.println("Partido");
					break;
				
				case "d":
					System.out.println("Inmueble");
					break;
				
				case "e":
					System.out.println("Espacio Publico");
					break;
					
				case "x":
					System.out.println("Salir");
					break;
					
				default:
					System.out.println("Opcion incorrecta, teclea otra opcion");
					break;
			}
			
		}while(!opcion.equalsIgnoreCase("x"));
		
		System.out.println("Programa terminado");
		
		
		
		tecla.close();
	}
	

}

