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
	
					String pueblo=" ";
					String tipo=" ";
					int habitatantes=0;
					int votantes=0;
					double area=0;
					String alcalde=" ";
					String partido=" ";
					int codPost=0;
					String provincia=" ";
					System.out.println("DATOS DEL AYUNTAMIENTO");
					System.out.println(" ");
					System.out.println("Ingresa los datos");
					System.out.print("Pueblo: ");
					nombre=tecla.nextLine();
					System.out.print("Tipo de localidad( ciudad, villa, etc): ");
					tipo=tecla.nextLine();
					System.out.print("Numero de habitatantes: ");
					habitatantes=tecla.nextInt();
					System.out.print("Numero de votantes: ");
					votantes=tecla.nextInt();
					System.out.print("Extension en km2: ");
					area=tecla.nextDouble();
					System.out.print("Nombre del alcalde: ");
					alcalde=tecla.nextLine();
					System.out.print("Codigo Postal: ");
					codPost=tecla.nextInt();
					System.out.print("Provincia: ");
					provincia=tecla.nextLine();

					Ayuntamiento a1=new Ayuntamiento();
					a1.setNombre(pueblo);
					a1.setTipo(tipo);
					a1.setPopulacion(habitatantes);
					a1.setCenso(votantes);
					a1.setExtension(area);
					a1.setAlcalde(alcalde);
					a1.setCp(codPost);
					a1.setProvincia(provincia);
					
					System.out.println("Datos del ayuntamiento");
					System.out.println("Pueblo: "+a1.getNombre());
					System.out.println("Tipo de pueblo: "+a1.getTipo());
					System.out.println("Habitantes: "+a1.getPopulacion());
					System.out.println("Censo: "+a1.getCenso());
					System.out.println("Area: "+a1.getExtension());
					System.out.println("Alcalde: "+a1.getAlcalde());
					System.out.println("Codigo Postal: "+a1.getCp());
					System.out.println("Provincia: "+a1.getProvincia());
					break;
				
				case "c":
					System.out.println("Partido");
					/*atributos
					private String nombre;
					private String siglas;
					private String ideologia;
					private int miembros;
					private String candidato;*/
					String nomPartido=" ";
					String siglas=" ";
					String idea=" ";
					int miembros=0;
					String candidato=" ";
					
					System.out.println("DATOS DEL PARTIDO");
					System.out.println(" ");
					System.out.println("Ingresa los datos");
					System.out.print("Nombre del partido: ");
					nomPartido=tecla.nextLine();
					System.out.print("Siglas: ");
					siglas=tecla.nextLine();
					System.out.print("Ideologia: ");
					idea=tecla.nextLine();
					System.out.print("Numero de afiliados: ");
					miembros=tecla.nextInt();
					System.out.print("Nombre del candidato: ");
					candidato=tecla.nextLine();
					
					Partido p1=new Partido();
					p1.setNombre(nomPartido);
					p1.setSiglas(siglas);
					p1.setIdeologia(idea);
					p1.setMiembros(miembros);
					p1.setCandidato(candidato);
					
					System.out.println("Datos introducidos del partido");
					System.out.println("Partido: "+p1.getNombre());
					System.out.println("Siglas: "+p1.getSiglas());
					System.out.println("Ideologia: "+p1.getIdeologia());
					System.out.println("Numero de afiliados: "+p1.getMiembros());
					System.out.println("Candidato: "+p1.getCandidato());
					break;
				
				case "d":
					System.out.println("Inmueble");
					/*
					 private String pueblo;
		private String calle;
		private int numPortal;
		private int piso;
		private String puerta;
		private boolean habitable;
		private String tipoLocal;
		private double metros;
					 */
					String nomPueblo=" ";
					String calle=" ";
					int portal=0;
					int piso=0;
					String puerta=" ";
					String habitable=" ";
					String tipoLocal=" ";
					double metros2=0;
					System.out.println("DATOS DEL INMUEBLE");
					System.out.println(" ");
					System.out.println("Ingresa los datos");
					System.out.print("Pueblo: ");
					nomPueblo=tecla.nextLine();
					System.out.print("Calle o Barrio: ");
					calle=tecla.nextLine();
					System.out.print("Nº de portal: ");
					portal=tecla.nextInt();
					System.out.print("Piso: ");
					piso=tecla.nextInt();
					System.out.print("Puerta: ");
					puerta=tecla.nextLine();
					System.out.print("Es habitable?(si/no) ");
					habitable=tecla.nextLine();
					System.out.print("Tipo de local(piso,apartamento,villa,garaje...): ");
					tipoLocal=tecla.nextLine();
					System.out.print("Cuantos metros cuadrados tiene? ");
					metros2=tecla.nextDouble();
					
					Inmueble i1=new Inmueble();
					i1.setPueblo(nomPueblo);
					i1.setCalle(calle);
					i1.setNumPortal(portal);
					i1.setPiso(piso);
					i1.setPuerta(puerta);
					i1.setHabitable(habitable);
					i1.setTipoLocal(tipoLocal);
					i1.setMetros(metros2);
					
					
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

