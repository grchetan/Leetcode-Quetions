
import java.util.Scanner;

public class UglyNumber263{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    boolean msg = false;

    if (n == 0) {
      System.out.println("false");
      msg = false;
      
    }
    else if (n == 1){
      System.out.println("True");
      msg = true;
    }

    while (n % 2 == 0) {
      n = n / 2;
      msg = true;
    }
   

     while (n % 3 == 0) {
      n = n / 3;
      msg = true;
    }
     while (n % 5 == 0) {
      n = n / 5;
      msg = true;
    }

    // now false condition 

  


  
sc.close();

  }
}