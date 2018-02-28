import java.util.Scanner;

public class Ejercicio_4 {

	
		private int metodoExcepcion(int div) {
			int resultado = 0;
			for (int i = 0; i < 5; i++) {
				resultado = 10 / div;
			}
			
			return resultado;
		}

		public static void main(String[] args) {
			Ejercicio_4 miPrograma = new Ejercicio_4();
			Scanner teclado = new Scanner (System.in);
			String num = teclado.next();
			if (resultado.isNumeric) {
				
			}
			try {
				miPrograma.metodoExcepcion(0);
			} catch (Exception e) {
				System.out.println("Se ha producido un error: " + e.getMessage());
			}
			System.out.println("Ahora sí se imprime");
		}
}