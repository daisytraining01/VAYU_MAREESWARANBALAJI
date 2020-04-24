package com.JavaAssessment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLine {

	public static void main(String[] args) throws IOException {
		BufferedReader reader;
			reader = new BufferedReader(new FileReader("Files/Hello.txt"));
			String line;
			for (int i=0;i<=10;i++)
			{
				line = reader.readLine();
				int value =i%2;
			if (line!=null && value!=0 )
			{	
				System.out.println(line);
			}		
			
			}
			reader.close();
	}
/*output:
line2
line4
line6
		*/
	}
			//
	
			