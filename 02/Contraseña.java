import java.util.Scanner;


public class Contraseña {
	
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
		String contraseña;
		Scanner scan = new Scanner(System.in);		
		do{	
			System.out.println("Ingrese una contraseña: ");
			contraseña = scan.nextLine();
		}while(contraseña.length()>9);
		if(!Mayuscula(contraseña)){
			System.out.println("Corrija su constraseña");
		}
		scan.close();
		
		
	}

}
