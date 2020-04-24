package com.JavaAssessment;

public class Overloading {

	String RemovedChar ="";
	String compare="";
	
	public void RemoveCharacter(String actual)
	{
	 
		RemovedChar=actual.substring(0,2)+actual.substring(4,12);
		System.out.println("Removing character ST: "+ RemovedChar);
	}
	
	public void comparestring (String str1,String str2)
	{
		
	if (str1.equals(str2))
	{
		
		System.out.println(str1+ "String is same as" + str2 + " Method Overloaded");
	}
	else {
		System.out.println(str1+ " String is not same as "+str2 + "Method Overloaded");
	}
		
/* Output:
Removing character ST: RE ASSURED
REST ASSURED String is not same as Rest
 */
	}

	public static void main(String[] args) {
	
		Overloading obj1=new Overloading();
		
		obj1.RemoveCharacter("REST ASSURED");
		obj1.comparestring("REST ASSURED","Rest");

	}

}
