# hunter
import java.util.Scanner;

public class Arrayelement{

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the n elements ");
    int n = s.nextInt();
    int[] arr = new int[n];
    int[] repeat = new int[n];
    for(int i = 0; i < arr.length; i++) {
      arr[i] = s.nextInt();
    }
    int a = 0;
    for(int j = 0; j < arr.length; j++) {
      for(int k = j+1; k < arr.length; k++)
      if(arr[j] == arr[k]) {
        repeat[a++] = arr[j];
      }
    }
    System.out.println(repeat[0]);
    s.close();
  }

}
