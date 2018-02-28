import java.util.Scanner;

public class ejercicio1 {
	
	Scanner sc=new Scanner(System.in);
	String chain = sc.nextLine();
	
 	private boolean esNumerico(String chain){
 	    try{
 	          Integer.parseInt(chain);
 	          return true;
 	    }
 	    catch(NumberFormatException ex){
 	        return false;
 	    }  
 	}
	
	private int sumatorio(){
		int suma=0;
		for (int i = 0; i < chain.length(); i++) {
			if(esNumerico(chain)){
				suma = suma+Integer.parseInt(chain);
			}	
		}
		return suma;
	}
	
	public static void main (String [] args) {
			System.out.println("Ejemplo de entrada: ");
		 	ejercicio1 a = new ejercicio1();
		 	System.out.println("Ejemplo de salida: " + a.sumatorio());	
	}
}


