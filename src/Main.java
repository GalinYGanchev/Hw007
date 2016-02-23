import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Insert Float:");
		float realNum = in.nextFloat();
		System.out.println("");
		System.out.println("Insert Number:");
		int number = in.nextInt();
		System.out.println("");

		float result = (float) realNum / number;
		System.out.print("Result a/b = ");
		System.out.println(result);
	}

}