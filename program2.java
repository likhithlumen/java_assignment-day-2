//Write a Java program to convert a hash set to an array.
import java.util.*;

public class program1
{
	public static void main(String[] args)
	{
		Set<Integer> numbers = new HashSet<>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		
		int[] array = new int[numbers.size()];
		
		int i = 0;
		
		for(Integer number:numbers)
		{
		  array[i] = number ;
			i++;
		}
		
		System.out.println("the elements from hash set to array are ");
		for(int j = 0 ; j <array.length;j++)
		{
			System.out.println(array[j]);
		}
	}
}
