
public class IfElseExample {

	public static void main(String[] args) {
		int itemCost = 300;
		int bankBalance = 1000;
		if (itemCost <= bankBalance) {
			bankBalance = bankBalance - itemCost;
			System.out.println("Thank you for purchase. Your account balance :"+ bankBalance);
		} else {
			System.out.println("Insufficient balance in your account :"+ bankBalance);
		}
	}
}