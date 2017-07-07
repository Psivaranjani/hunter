# hunter
import java.util.ArrayList;


public class ArraySubSet {
 	public static void main(String args[]) {
  		int[] a1 = { 1, 2, 3 };
  		int[] a2 = { 2, 3 };
  		if(a1.length!=0 && a2.length!=0){
    	
    		ArrayList<Integer> intList = new ArrayList<Integer>();
    		for (int index = 0; index < a1.length; index++) {
     			intList.add(a1[index]);
    		}
    		
    		ArrayList<Integer> intList1 = new ArrayList<Integer>();
    		for (int index = 0; index < a2.length; index++) {
     			intList1.add(a2[index]);
    		}
    		
    		if (intList.containsAll(intList1)) {
     			System.out.println("a2 is the subset of a1");
    		} else {
     			System.out.println("a2 is not the subset of a1");
    		}
  		}
 	}
}
