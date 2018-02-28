import java.util.Scanner;

public class ej2 {
	public static void main(String[] args) {
metodo();
	}

	public static  void  metodo() {
		Scanner sc = new Scanner(System.in);
		String cadena = sc.nextLine();
		
			
				String s1 = cadena.substring(0, 1).toUpperCase();
				String cadenamayus = s1 + cadena.substring(1);
						System.out.println(cadenamayus);
				
			}
		}
	
	

