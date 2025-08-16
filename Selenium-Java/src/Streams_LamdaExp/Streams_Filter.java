package Streams_LamdaExp;

import java.util.ArrayList;

public class Streams_Filter {

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
		
		//Streams and Lamda exp 
		long countLamda = name.stream().filter(s->s.startsWith("A")).count();
		System.out.println("Stream and Lambda: " + countLamda);
		
		//Names with lenght >4
		name.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
		//Only first name
		name.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
		//Print name length less the 4
		name.stream().filter(s->s.length()<=4).forEach(s->System.out.println(s));
		
		
		

	}

}
