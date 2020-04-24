package com.JavaAssessment;

public class StringPalindrome {

	String Reverse ="";
	
	public StringPalindrome(String actual) {
			 
	for (int i=actual.length()-1; i>=0;i--)
	{
		Reverse = Reverse + actual.charAt(i);
	}
	//System.out.println(Reverse);
		
	if (actual.equals(Reverse))
	{
		
		System.out.println(actual+" "+ "String is same after reversing"+" "+ Reverse +" "+ " Hence it is Planidrome" );
	}
	else {
		System.out.println(actual+" "+ "String is not same after reversing"+" "+ Reverse +" "+ " Hence it is not Planidrome" );
	}
		
/* Output:
MAM String is same after reversing MAM  Hence it is Planidrome
 */
	}

	public static void main(String[] args) {
	
		new StringPalindrome("MAM");

	}

}