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
      sum += numInput;
      numInput = sc.nextInt();
    }
    System.out.println("Sum is " + sum);

    //Problem 2
    int inputAmt = sc.nextInt();
    int i = 0;
    int max = 0;
    while (i < inputAmt){
      int valInput = sc.nextInt();
      if (i == 0 || valInput>max){
        max = valInput;
      }
      i++;
    }
    System.out.println("The largest score is " + max);

    //Problem 3
    
  }
}
