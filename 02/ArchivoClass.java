import java.util.Scanner;


public class ArchivoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cad,nombre;
		Scanner cadena = new Scanner(System.in);
		System.out.println("Ingrese la ruta: ");
		cad=cadena.next();		
		nombre=cad.substring(cad.lastIndexOf("/")+1, cad.length());
		System.out.println(nombre);
		cadena.close();
	}

}
