import java.util.Scanner;


public class Contrase�a {
	
	public static boolean Mayuscula(String cad){		
		int valor =0;
		for(int i=0;i<cad.length();i++){			
			if(Character.isUpperCase(cad.charAt(i))){
				valor++;
			}
		}
		if(valor>1){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String contrase�a;
		Scanner scan = new Scanner(System.in);		
		do{	
			System.out.println("Ingrese una contrase�a: ");
			contrase�a = scan.nextLine();
		}while(contrase�a.length()>9);
		if(!Mayuscula(contrase�a)){
			System.out.println("Corrija su constrase�a");
		}
		scan.close();
		
		
	}

}
