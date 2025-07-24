package com.det;

public class CustomerName {
	public static void main(String agrs[])
	{
		String s1="Velu";
		int lower=0;
		int upper=0;
		for(int i=0;i<s1.length();i++)
		{
			char ch = s1.charAt(i);
			if(ch>=65&&ch<=90)
			{
				upper++;
			}
			else {
				lower++;
			}
		}
		System.out.println("lower"+lower);
		System.out.println("upper"+upper);
		
	}
}
