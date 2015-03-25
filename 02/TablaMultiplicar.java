import java.util.Scanner;


public class TablaMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor,indice;
		indice=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		try{
			valor=Integer.parseInt(scan.next());
			while(indice<11){
				System.out.println("- "+indice+" x "+valor+" = "+ indice*valor);
				indice++;
			}
		}catch(NumberFormatException nfe){
			System.out.println("Error");
		}finally{
			scan.close();
		}	

	}

}
