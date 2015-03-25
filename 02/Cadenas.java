
public class Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mensaje = "Este es el mensaje de bienvenida";
		String[] palabras = mensaje.split(" ");
		for(int i=0;i<palabras.length;i++){
			System.out.println(palabras[i]);
		}
		System.out.println("Caracter: "+mensaje.charAt(0));
		System.out.println("Subcadena: "+mensaje.substring(5,9));
		System.out.println("IndexOf: "+mensaje.indexOf("e"));
		System.out.println("LastIndexOf: "+mensaje.lastIndexOf("e"));
		System.out.println("Contains: "+mensaje.contains("mensaje"));
		System.out.println("Upper: "+mensaje.toUpperCase());
		System.out.println("Lowe: "+mensaje.toLowerCase());

	}

}
