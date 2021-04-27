package pruebas;

public class Moon {

	public static void main(String[] args) {
		
		Tablero tab1= new Tablero(14,7);

		
		
		System.out.println();
		tab1.imprimirtablero();
		
		tab1.cambiarcelda("D",1,'r');

		tab1.obtenercelda("B",4);
		tab1.obtenercelda("D",1);
		tab1.obtenercelda("G",14);
		
		
		
		
		}

}
