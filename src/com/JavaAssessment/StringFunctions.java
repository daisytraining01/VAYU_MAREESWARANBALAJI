package com.JavaAssessment;

public class StringFunctions {
	String RemovedChar ="";
	String compare="";
	
	public void RemoveCharacterAndCompareString(String actual)
	{
	 
		RemovedChar=actual.substring(0,2)+actual.substring(4,12);
		System.out.println("Removing character ST: "+ RemovedChar);
		
	if (actual == RemovedChar)
	{
		
		System.out.println(actual+ "String is same as "+RemovedChar );
	}
	else {
		System.out.println(actual+ " String is not same as "+RemovedChar);
	}
		
/* Output:
Removing character ST: RE ASSURED
REST ASSURED String is not same as RE ASSURED
 */
	}

	public static void main(String[] args) {
	
		StringFunctions obj1=new StringFunctions();
		
		obj1.RemoveCharacterAndCompareString("REST ASSURED");

	}

}
