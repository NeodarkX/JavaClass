
public class NStringB {
	public static void main(String[] args) {
		StringBuilder cadena = new StringBuilder();
		cadena.append("texto de la cadena");
		System.out.println(cadena);
		cadena.delete(2, 5);
		System.out.println(cadena);
		cadena.deleteCharAt(7);
		System.out.println(cadena);
		cadena.insert(5,"nuevo");
		System.out.println(cadena);
		cadena.replace(0, 2, "otro");
		System.out.println(cadena);
		cadena.reverse();
		System.out.println(cadena);
	}
}
