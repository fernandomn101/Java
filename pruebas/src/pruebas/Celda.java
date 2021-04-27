package pruebas;

public class Celda {
	private String horizontal;
	private int vertical;
	private char color;
	private static int NUMLED=0;
	private int led;

	

	public Celda(int v, String h,  char c) {
		horizontal = h; 
		vertical = v;
		color = c;
		led = NUMLED;
		NUMLED++;
	}

	public String getHorizontal() {
		return horizontal;
	}

	public int getVertical() {
		return vertical;
	}

	public char getColor() {
		return color;
	}

	public void setColor(char color) {
		this.color = color;
	}

	public int getLed() {
		return led;
	}	
}
