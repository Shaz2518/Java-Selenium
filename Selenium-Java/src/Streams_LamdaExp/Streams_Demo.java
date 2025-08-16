package Streams_LamdaExp;

import java.util.ArrayList;

public class Streams_Demo {

	public static void main(String[] args) {
		
		// Count the names starts with A 
		ArrayList<String> name = new ArrayList<String>();
		name.add("Abhishek");
		name.add("Sumit");
		name.add("Ali");
		name.add("Ajay");
		name.add("Atul");
		int count =0;
		
		//Brute Force Approach
		for(int i=0; i<name.size(); i++)
		{
			String names = name.get(i);
			if(names.startsWith("A"))
			{
				count++;
			}
		}
		System.out.println("Brute Force count: " + count);
		
		//Lamda exp and streams
		long countLamda = name.stream().filter(s->s.startsWith("A")).count();
		System.out.println("Stream and Lambda: " + countLamda);
		
		

	}

}
