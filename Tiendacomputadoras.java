package tienda;
import java.util.ArrayList;
import java.util.Scanner;
/*Escribir un programa en Java que que modele una tienda de computadores. La tienda posee los siguientes atributos:
 *  Nombre de la tienda, Propietario de la tienda, Identificador tributario de la tienda.
 *   Los computadores de la tienda tienen los siguientes atributos:
 *    Marca del computador, Cantidad de memoria,Características del procesador, Sistema operativo,Precio del computador.
 *     El programa debe poseer métodos que permitan: Agregar un computador a la tienda,
 *       Eliminar un computador de la tienda dada su marca, 
 *       Buscar un computador en la tienda dada su marca, Listar la información de todos los computadores que tiene la tienda
 *       Por Juan Fernandez. Para programacion 2-UBA 
 */
public class Tiendacomputadoras {
	//Se ingresan los atributos
	private String nombre,propietario;
	private int identificador;
	private ArrayList<Computadora> Listacomputadoras;
//Se crea el constructor
public Tiendacomputadoras(String nombre, String propietario, int identificador) {
	super();
	this.nombre = nombre;
	this.propietario = propietario;
	this.identificador = identificador;
	this.Listacomputadoras= new ArrayList<>();
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getPropietario() {
	return propietario;
}

public void setPropietario(String propietario) {
	this.propietario = propietario;
}

public int getIdentificador() {
	return identificador;
}

public void setIdentificador(int identificador) {
	this.identificador = identificador;
}	
	
//Metodo para agregar computadora
public void agregar() {
	Scanner read = new Scanner(System.in);
	System.out.println("Ingrese la marca de la computadora");
	String marca=read.nextLine();
	System.out.println("Ingrese la cantidad de memoria de la computadora");
	int cantidadmemoria=read.nextInt();
	read.nextLine();
	System.out.println("Ingrese las caracteristicas del procesador de la computadora");
	String caracteristicas=read.nextLine();
	System.out.println("Ingrese el nombre del sistema operativo de la computadora");
	String Sistemaop=read.nextLine();
	System.out.println("Ingrese el precio");
	double precio=read.nextDouble();
	Computadora computadora = new Computadora (marca,cantidadmemoria,caracteristicas,Sistemaop,precio);
	Listacomputadoras.add(computadora);
}
//Metodo para eliminar computadora
public void eliminar(String marca) {
	Scanner read = new Scanner(System.in);
	System.out.println("Ingrese la marca de la computadora que desea eliminar");
	String m=read.nextLine();
	for(Computadora computadora : Listacomputadoras) {
		if(computadora.getMarca().equals(m)) {
			Listacomputadoras.remove(computadora);
			System.out.println("Se ha eliminado la computadora de marca "+m);
			return;
			}
		else {
			System.out.println("La marca de computadora "+m+" no se encuentra en la lista");
		}
	}
}
//Metodo buscar computadora
public void buscar(String marca) {
	Scanner read = new Scanner(System.in);
	System.out.println("Ingrese la marca de la computadora que busca");
	String m=read.nextLine();
	for(Computadora computadora : Listacomputadoras) {
		if(computadora.getMarca().equals(m)) {
			System.out.println("Se ha encontrado la computadora de marca "+m);
			System.out.println(computadora.toString());
			return;
			}
		else {
			System.out.println("La marca de computadora "+m+" no se encuentra en la lista");
		}
	}
}
//Metodo para ver lista
public void verlista () {
	System.out.println("Lista de computadoras");
	for(Computadora computadora: Listacomputadoras) {
		System.out.println(computadora);
	}
	
}
public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	Tiendacomputadoras t = new Tiendacomputadoras ("CyberShop","Juan Fernandez",12345678);
	ArrayList <Computadora> Listacomputadoras = new ArrayList <Computadora>();
		System.out.println("Bienvenido a Compumarket");
		boolean Continuar=true;
	while(Continuar==true) {
			System.out.println("Seleccione la opcion que desee realizar");
			System.out.println("1. Agregar computador"+"\n"+"2. Eliminar computador"+"\n"+"3. Buscar computador"+"\n"+
			"4. Mostrar lista de computadores"+"\n"+"5. Salir");
			int opcion =read.nextInt();
			switch(opcion) {
			case 1:
				
				t.agregar();
				break;
			case 2:
			t.eliminar("");
				break;
			case 3:
			t.buscar("");
				break;
			case 4:
			t.verlista();
			break;
			case 5:
				Continuar = false;
				break;
			default:
				System.out.println("El numero o caracter seleccionado no pertenece a las opciones indicadas");
			}
				
		}
	}
	
}

