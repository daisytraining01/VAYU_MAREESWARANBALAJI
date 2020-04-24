package com.JavaAssessment;

public class ConstructorEncapsulationInheritance {

	private String str;
	static String Reverse ="";
	//private static String AssosiateName;
	
	public ConstructorEncapsulationInheritance(String actual) {
			 
	for (int i=actual.length()-1; i>=0;i--)
	{
		Reverse = Reverse + actual.charAt(i);
	}
	//System.out.println(Reverse);
		
	if (actual.equals(Reverse))
	{
		System.out.println("Constructor Method got executed");
		System.out.println(actual+" "+ "String is same after reversing"+" "+ Reverse +" "+ " Hence it is Planidrome" );
	}
	else {
		System.out.println("Constructor Method got executed");
		System.out.println(actual+" "+ "String is not same after reversing"+" "+ Reverse +" "+ " Hence it is not Planidrome" );
	}
	}
	
	public String getReverse(){
        return str;
    }

	public void setReverse(String str)
	{
		System.out.println("Encapsulation of string variable str: " + str);
	}

	class child extends ConstructorEncapsulationInheritance
	{
		public child(String actual) {
			super(actual);
			// TODO Auto-generated constructor stub
		}
		
		
/* Output:
Constructor Method got executed
MAM String is same after reversing MAM  Hence it is Planidrome
Encapsulation of string variable str: Mam
 */

	}
	public static void main(String[] args) {
	
		//new ConstructorEncapsulationInheritance("MAM");
		ConstructorEncapsulationInheritance obj1 = new ConstructorEncapsulationInheritance("MAM");
		obj1.setReverse("Mam");
		//obj1.child("Inheritance");
		//obj2.sub("Inheritance");
	}

		
	}
