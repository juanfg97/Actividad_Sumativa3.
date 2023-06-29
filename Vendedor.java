package Lista;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;
/*Escribir un programa en java que ordene un arreglo de manera ascendente de una lista de vendedores 
y sus respectivas ventas. Mostrar por consola el antes y después.
Por Juan Fernandez. Para programacion 2 - UBA
*/
//Se crea la clase vendedor y se asignan sus atributos
public class Vendedor {
private String Nombre;
private String Apellido;
private int Ventas;
public Vendedor(String nombre, String apellido, int ventas) {
	super();
	Nombre = nombre;
	Apellido = apellido;
	Ventas = ventas;
}
// se crean los metodos get
public String getNombre() {
	return Nombre;
}
public String getApellido() {
	return Apellido;
}
public int getVentas() {
	return Ventas;
}


//Se aplica la implementacion personalizada del metodo toString
@Override
public String toString() {
    return "Vendedor"+ "\n"+"Nombre: "+ Nombre+" "+"Apellido: "+Apellido + "\n "+"Ventas: "+ Ventas +" $" ;
}

public static void main(String[] args) {
	//Se crean 5 objetos de la clase Vendedor
	Vendedor v1 = new Vendedor("Juan","Fernandez",1200);
	Vendedor v2 = new Vendedor("Pedro","Perez",2000);
	Vendedor v3 = new Vendedor ("Ana","Garcia",1500);
	Vendedor v4 = new Vendedor ("Maria","Torres",1000);
	Vendedor v5 = new Vendedor ("Luis","Sanchez",3000);
	//Se crea la lista de vendedores
	List<Vendedor> Listavendedores = new ArrayList <Vendedor>();
	//Se agregan los objetos de la clase Vendedor a la lista
	Listavendedores.add(v1);
	Listavendedores.add(v2);
	Listavendedores.add(v3);
	Listavendedores.add(v4);
	Listavendedores.add(v5);
	//Se muestra la lista
	System.out.println("Lista de vendedores");
	for (Vendedor v : Listavendedores) {
		System.out.println(v.toString());
	}
	//Se ordena la lista en funcion a las ventas de forma ascendente
	  Collections.sort(Listavendedores, Comparator.comparing(Vendedor::getVentas).reversed());
	 //Se muestra la lista ordenada
	  System.out.println("Lista ordenada");
	  for (Vendedor v : Listavendedores) {
			System.out.println(v.toString());
	  }
	}
}
