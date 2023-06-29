package tienda;
public class Computadora {
	//se asignan atributos
private String marca,caracteristicas,Sistemaop;
private int cantidadmemoria;
private double precio;
//Se crea constructor
public Computadora(String marca,int cantidadmemoria ,String caracteristicas, String Sistemaop , double precio) {
	super();
	this.marca = marca;
	this.caracteristicas = caracteristicas;
	this.Sistemaop = Sistemaop;
	this.cantidadmemoria = cantidadmemoria;
	this.precio = precio;
}
//Se agregan los metodos getters y setters 
	public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public String getCaracteristicas() {
	return caracteristicas;
}

public void setCaracteristicas(String caracteristicas) {
	this.caracteristicas = caracteristicas;
}

public String getSistemaop() {
	return Sistemaop;
}
public void setSO(String Sistemaop) {
	this.Sistemaop = Sistemaop;
}
public int getCantidadmemoria() {
	return cantidadmemoria;
}
public void setCantidadmemoria(int cantidadmemoria) {
	this.cantidadmemoria = cantidadmemoria;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}

//Se aplica la implementacion personalizada del metodo toString
@Override
public String toString() {
return "Marca: "+ marca+"\n"+"Cantidadmemoria: "+cantidadmemoria +"\n"+
"Caracteristicas de procesador: "+ caracteristicas +"\n"+"Sistema operativo:"+Sistemaop+"\n"+"Precio: "+precio+"$"+"\n";
}
 




}
