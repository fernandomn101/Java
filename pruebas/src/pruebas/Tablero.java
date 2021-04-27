package pruebas;

import java.util.ArrayList;

public class Tablero {

	private Celda[][] celdas;
	ArrayList<String> abcdario; 

	public Tablero(int filas, int columnas) {
		
		llenarabcdario();
		
		celdas = new Celda[filas][columnas];
		
		for (int i = 0; i < filas; i++) {
			
			//de Izquierda a derecha, filas pares
			if (i%2==0) {
				for (int j = 0; j < columnas; j++) {
					celdas[i][j]=new Celda(i+1,letradecolumna(j), '·');
				}
			}
			
			//de derecha a izquierda, filas impares
			if (i%2==1) {
				for (int j = columnas-1; j >=0; j--) {
					celdas[i][j]=new Celda(i+1,letradecolumna(j), '·');
				}
			}			
		}
		
		
	}

	@SuppressWarnings("serial")
	private void llenarabcdario() {
		abcdario = new ArrayList<String>(){{add("A");add("B");add("C");add("D");add("E");add("F");
		add("G");add("H");add("I");add("J");add("K");add("L");add("M");add("N");add("O");add("P");add("Q");add("R");add("S");
		add("T");add("U");add("V");add("W");add("X");add("Y");add("Z");}};
	}
	
	private int columnadeletra(String letra) {
		return abcdario.indexOf(letra);
	}
	
	private String letradecolumna(int j){
		return abcdario.get(j);
	}
	
	public void imprimirtablero(){
		for (int i = 0; i < celdas.length; i++) {
			for (int j = 0; j < celdas[i].length; j++) {
				System.out.print(celdas[i][j].getHorizontal()+Integer.toString(celdas[i][j].getVertical())+celdas[i][j].getColor()+celdas[i][j].getLed()+" \t");
			}
			System.out.println();
		}
	}

	public void cambiarcelda(String letra,int fila,char color){
		celdas[fila-1][columnadeletra(letra)].setColor(color);
	}
	
	public void obtenercelda(String letra,int numero){
		String led,color;
		int numled = celdas[numero-1][columnadeletra(letra)].getLed();
		if(numled<10){
			led="00"+numled;
		}else if (numled<100) {
			led="0"+numled;
		}else{
			led= String.valueOf(numled);
		}
		color=String.valueOf(celdas[numero-1][columnadeletra(letra)].getColor());
		
		System.out.println(led+color);
		
	}
}