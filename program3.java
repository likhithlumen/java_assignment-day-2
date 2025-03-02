//Write a Java program to copy all mappings from the specified map to another map.

import java.util.*;
public class program3
{
	public static void main(String[] agrs)
	{
		HashMap<Integer,String> empid = new HashMap<>();
		empid.put(1,"ramu");
		empid.put(2, "naveen");
		empid.put(3, "veer");
		
		HashMap<Integer,String> empid2 = new HashMap<>();
		
		empid2.putAll(empid);
		
		System.out.println(empid2);
		
		
	}
}
	
