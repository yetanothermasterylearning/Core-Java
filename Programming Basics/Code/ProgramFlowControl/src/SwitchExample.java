
public class SwitchExample {

	public static void main(String[] args) {
		char cardValue = 'K';
		switch (cardValue) {
		case 'K':
			System.out.println("King");
			break; // comment this break to check the flow
		case 'Q':
			System.out.println("Queen");
			break;
		case 'J':
			System.out.println("Jack");
			break;
		case 'A':
			System.out.println("Ace");
			break;
		}
	}

}
