import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your number to guess lucky Num");
		
		int luckyNum = 5;
		int guessNum = (int) scanner.nextInt();
		
		switch(guessNum) {
		case 3:
			System.out.println("Your num is less than lucky Num");
			break;
		case 9:
			System.out.println("Your num is greater than lucky Num");
			break;
		case 5:
			System.out.println("You have guessed the num!!!");
			break;
		default:
			System.out.println("Enter your guess one more time");
			break;
		}
		
	}
}
