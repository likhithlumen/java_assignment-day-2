package workshop;
/*Write a Java program to retrieve an element 
(at a specified index) from a given array list
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class program1 {

	public static void main(String[] args)
	{
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(10,20,30,40,50));
		
		System.out.println("Enter the index of the element");
		
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		
		System.out.println("element at the index is :" + a.get(b));
	}
}
