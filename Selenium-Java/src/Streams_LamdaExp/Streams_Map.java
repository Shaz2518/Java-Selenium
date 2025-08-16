package Streams_LamdaExp;

import java.util.ArrayList;

public class Streams_Map {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Abhishek");
		name.add("Sumit");
		name.add("Ali");
		name.add("Amit");
		name.add("Sujit");
		
		//Name end with "t"

		name.stream().filter(s->s.endsWith("t")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}

}
