package assignment02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AssignmentTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);

		System.out.println("----------------Problem 1-------------------");

		ArrayList<String> A1 = new ArrayList<String>();
		
		System.out.println("Enter no.of inputs");
		int s1 = sc.nextInt();
		for (int i = 0; i < s1; i++) {
			System.out.println("Enter the Value");
			String string1 = sc.next();
			
			A1.add(string1);
		}
		AssignmentTwo.problem01(A1);
		
		
		System.out.println("----------------Problem 2-------------------");
		
		

		System.out.println("Enter no.of inputs");
		int s2 = sc.nextInt();		
		ArrayList<String> A2=new ArrayList<String>();
		for (int i = 0; i < s2; i++) {
			
			System.out.println("Enter the value");
			String string2 = sc.next();
			A2.add(string2);
		}
		
		
		System.out.println(problem02(A2));


		System.out.println("----------------Problem 3-------------------");

		System.out.println("Enter the no.of inputs");
		int s3 = sc.nextInt();		
		ArrayList<Integer> A3=new ArrayList<Integer>();
		for (int i = 0; i < s3; i++) {
			
			System.out.println("Enter the value");
			int n = sc.nextInt();
			A3.add(n);
		}
		
		Set<Integer> se=problem03(A3);
	  System.out.println(se);

		
		
	  System.out.println("----------------Problem 4-------------------");

	  System.out.println("Enter the no.of inputs");
		int s4 = sc.nextInt();		
		ArrayList<String> A4=new ArrayList<String>();
		for (int i = 0; i < s4; i++) {
			System.out.println("Enter the value ");
			String string4 = sc.next();
			A4.add(string4);
		}
		System.out.println(problem04(A4));
		
		 System.out.println("----------------Problem 5-------------------");

		 System.out.println("Enter the no.of inputs");
			int s5 = sc.nextInt();			
		ArrayList<String> A5=new ArrayList<String>();
		
		for (int i = 0; i < s5; i++) {
			System.out.println("Enter the value ");
			String string5 = sc.next();
			A5.add(string5);
		}
		
		System.out.println(problem05(A5));

		
		System.out.println("----------------Problem 6-------------------");

		System.out.println("Enter the no.of inputs");
		int s6 = sc.nextInt();		
		ArrayList<String> A6=new ArrayList<String>();
		for (int i = 0; i < s6; i++) {
			
			System.out.println("Enter the Value");
			String string6 = sc.next();
			A6.add(string6);
		}
		
		
		
		System.out.println(problem06(A6));

	}
	
	
	public static void problem01(ArrayList<String> S)
	{
		Map<String,Integer> m1=new HashMap<String,Integer>();
		
		for(String s : S)
		{
			if(m1.containsKey(s))
			{
				m1.put(s, m1.get(s) + 1);
			}
			else
			{
				m1.put(s,1);
			}
		}
		
		System.out.println(m1);
	}
	

	public static Map<String, String> problem02(ArrayList<String> A1)
	{
		Map<String, String> m2 = new HashMap<String, String>();

		for (String s : A1) {
			if(m2.containsKey(s.substring(0,1)))
			{
				String w=m2.get(s.substring(0,1));
				m2.put(s.substring(0,1), w+s);
				
			}
			else
				m2.put(s.substring(0,1), s);
		}
		return m2;

	}
	
	
	public static Set<Integer> problem03(ArrayList<Integer> A3)
	{
		Set<Integer> se2=new LinkedHashSet<Integer>();
		for(int i:A3)
		{			
			while(!se2.add(i))
			{
				i=i+1;
			}
		}
		
		return se2;
	}
	
	
	public static ArrayList<String> problem04(ArrayList<String> str) {

		ArrayList<String> a2 = new ArrayList<String>();
		for (String s : str) {
			char s1[] = s.toCharArray();
			int n = s1.length;
			int index = 0;

			for (int i = 0; i < n; i++) {

				int j;
				for (j = 0; j < i; j++) {
					if (s1[i] == s1[j]) {
						break;
					}
				}

				if (j == i) {
					s1[index++] = s1[i];
				}
			}

			a2.add(String.valueOf(Arrays.copyOf(s1, index)));
		}
		return a2;
	}

	


	public static Map<String, String> problem05(ArrayList<String> A5) {
		Map<String, String> m5 = new HashMap<String, String>();

		for (String sst : A5) {
			
			m5.put(sst.substring(0,1), sst.substring(sst.length() - 1, sst.length()));
		}
		return m5;
	}
	

	public static Map<String,Boolean> problem06(ArrayList<String> A6)
	{
		Map<String,Boolean> m6=new HashMap<String,Boolean>();
		
		for(String st2:A6)
		{
			if(m6.containsKey(st2))
			{
				m6.put(st2, true);
			}else {
				m6.put(st2, false);
			}
			}
		return m6;
	}

		

	

}
