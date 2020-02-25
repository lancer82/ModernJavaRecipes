package enums;

public class SignalEnum {
	
	static Signal color = Signal.RED;
	
	public static void changes() {	
		switch(color) {
			case RED:
				color = Signal.GREEN;
				break;
			case YELLOW:
				color = Signal.RED;
				break;
			case GREEN:
				color = Signal.YELLOW;
				break;
		}
	}
		
	public static void main(String[] args) {
		changes();
		System.out.println("The next color is:" + color.toString() );
		changes();
		System.out.println("The next color is:" + color.toString() );
		changes();
		System.out.println("The next color is:" + color.toString() );
	}

}
