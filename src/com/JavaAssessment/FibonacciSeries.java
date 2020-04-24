package com.JavaAssessment;

public class FibonacciSeries {
	
	public void finonacci(int a)
	{
		int value1 = 0, value2=1;
		
		System.out.println(value1);
		System.out.println(value2);
		
		for(int i=2;i<a;++i)
			    	
	    {
	    int feb = value1+value2;
	    System.out.println(feb);
	    value1 = value2;
	    value2=feb;
	    }
		
/*Output:
0
1
1
2
3
5
8
13
21
34 */
		
	}

	public static void main(String[] args) {
		
		FibonacciSeries obj1 =new FibonacciSeries();
		obj1.finonacci(10);

	}
}
