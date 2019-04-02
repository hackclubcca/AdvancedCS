import java.util.ArrayList;
import java.util.Arrays;

public class NDimensions<Something> {
	ArrayList<Object> nDimensions;
	ArrayList<Object> actualArray;
	public NDimensions(int i) {
		// TODO Auto-generated constructor stub
		recursion(i);
	}
	public static Object[] recursion(int i) {
		if (i == 0) return new Object[] {};
		return new Object[]{recursion(i-1)};
	}
	public static void main(String[] args) 
    { 
        // Create Linked List 
        List<String> myList = new List<>(); 
          
        // Add Elements 
        myList.add("abc"); 
        myList.add("mno"); 
        myList.add("pqr"); 
        myList.add("xyz"); 
          
        // Iterate through the list using For Each Loop 
        for (String string : myList) 
            System.out.println(string); 
    } 
}
class Main { 
    public static void main(String[] args) 
    { 
        // Create Linked List 
        List<String> myList = new List<>(); 
          
        // Add Elements 
        myList.add("abc"); 
        myList.add("mno"); 
        myList.add("pqr"); 
        myList.add("xyz"); 
          
        // Iterate through the list using For Each Loop 
        for (String string : myList) 
            System.out.println(string); 
    } 
} 