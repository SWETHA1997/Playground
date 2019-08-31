import java.util.Scanner;
class Main{
	public static void main (String[] args) {
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int answer = n1/100 + n1%10;
      System.out.println(answer);
		// enter a three digit number
	}
}