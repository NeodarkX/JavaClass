import java.util.Scanner;


public class Palabras {
	
	public static void Verificar(String a,String b){
		int valor=0;
		for(int i=0;i<b.length();i++){
			for(int j=0;j<a.length();j++)
			if(a.charAt(j)==b.charAt(i)){
				valor++;
				break;
			}
		}
		if(valor==b.length()){
			System.out.println("Si");
		}else{
			System.out.println("No");
		}
	}
	public static void main(String[] args) {
		String cad,cad2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese una palabra: ");
		cad=scan.next();
		System.out.println("Ingrese una palabra: ");
		cad2=scan.next();
		Verificar(cad, cad2);
		scan.close();
	}

}
