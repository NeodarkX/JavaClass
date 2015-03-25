import java.util.Scanner;


public class MaxMin {
	public static void main(String[] args){
		int indice=0;
		int[] array = new int[10];
		Scanner scan = new Scanner(System.in);
		while(indice<10){
			System.out.println("Ingrese el numero "+ (indice+1));
			array[indice]=scan.nextInt();
			indice++;
		}
		int mayor=0;
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				if(Integer.max(array[i],array[j])>mayor){
					mayor=Integer.max(array[i],array[j]);
				}
			}
		}
		System.out.println(mayor);
		int menor=Integer.min(array[0],array[1]);
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				if(Integer.min(array[i],array[j])<menor){
					menor=Integer.min(array[i],array[j]);
				}
			}
		}
		System.out.println(menor);
		scan.close();
		
	}
}
