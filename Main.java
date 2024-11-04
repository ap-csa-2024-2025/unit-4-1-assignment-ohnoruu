import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here
    Scanner sc = new Scanner(System.in);
    //Problem 1
    int numInput=sc.nextInt();
    int sum = 0;
    while(numInput != -1){
      numInput = sc.nextInt();
      sum += numInput;
    }
    System.out.println("Sum is " + sum);
  }
}
