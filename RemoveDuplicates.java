# hunter
import java.util.*;
public class RemoveDuplicates
{
  
  public static void main(String args[])
  {     Scanner sc=new Scanner(System.in);
      System.out.println("Input String");
      String input=sc.nextLine();
      System.out.println(input);
      countWords(input);
        } 
  static void countWords(String st)
  {
      String[] words = st.split("\\s");
      for (int i = 0; i < words.length; i++)
      {
        for (int j = 0; j < words.length; j++)
        {
            if (words[i].equals(words[j]))
            {
              if (i != j)
                words[i] = "";
          
            }
        }
      }
                   System.out.println("Removing Duplicate words:\n");
      for (int i = 0; i < words.length; i++)
      {
           
        if (words[i] != "")
        {
            System.out.print(words[i]+" ");
                    }
      }
  }
}
