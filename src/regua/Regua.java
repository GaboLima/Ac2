package regua;

public class Regua {
	
	public static void drawOneTick(int tickLength) {	drawOneTick(tickLength, -1);}
	
	public static void drawOneTick(int tickLength, int tickLabel) {
		for (int i =0; i < tickLength; i++) System.out.print("-");
		if (tickLabel >= 0) System.out.print(" " + tickLabel);
		System.out.print("\n");
	}
	
	public static void drawTickts(int tickLength) {
		if (tickLength > 0) {
			drawTickts(tickLength - 1);
			drawOneTick(tickLength);
			drawTickts(tickLength - 1);
		}
	}
	
	public static void drawRuler(int nInches, int majorLength) {
		drawOneTick(majorLength, 0);
		for (int i =1; i <= nInches; i++) {
			drawTickts(majorLength - 1);
			drawOneTick(majorLength, i);
		}
	}

	public static void main(String[] args) {
		drawRuler(1,5);

	}

}
