import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int result=greatest_of_2_numbers(n1,n2);
      System.out.print(greatest_of_2_numbers(result,n3));
    }
  public static int greatest_of_2_numbers(int num1,int num2)
  {
    int max_no = 0;
    if(num1>num2)
    {
      max_no =num1;
    }
    else
    {
      max_no = num2;
    }
    return max_no;
	}
}