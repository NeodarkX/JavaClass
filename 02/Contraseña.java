import java.util.Scanner;


public class Contraseņa {
	
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
		String contraseņa;
		Scanner scan = new Scanner(System.in);		
		do{	
			System.out.println("Ingrese una contraseņa: ");
			contraseņa = scan.nextLine();
		}while(contraseņa.length()>9);
		if(!Mayuscula(contraseņa)){
			System.out.println("Corrija su constraseņa");
		}
		scan.close();
		
		
	}

}
