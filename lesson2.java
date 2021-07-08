package exception;
import java.util.Scanner;
public class exceptionn {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner (System.in) ;
		System.out.println("Enter a number between 1 and 10");
		try {
			int no = keyboard.nextInt();
			if (no < 1 || no > 10) {
				throw new myexcption ();
			}
		}catch (myexcption e) {
			System.out.println(e.getMessage());
		}
	}
}
