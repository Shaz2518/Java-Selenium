package Streams_LamdaExp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class Streams_Map {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Abhishek");
		name.add("Sumit");
		name.add("Ali");
		name.add("Amit");
		name.add("Sujit");

		// Name end with "t"
		// name.stream().filter(s->s.endsWith("i")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));

		// Name start with letter 'A' and sort
		// name.stream().filter(s->s.startsWith("S")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));

		// Merge 2 list
		String[] arr = { "John", "Abraham", "Jaun", "Elia" };
		List<String> newName = Arrays.asList(arr);
		Stream<String> finalString = Stream.concat(name.stream(), newName.stream());
		// finalString.sorted().forEach(s->System.out.println(s));

		// Check if Adam is present in list
		/*
		 * boolean flag = finalString.anyMatch(s->s.equalsIgnoreCase("John"));
		 * 
		 * System.out.println(flag); Assert.assertTrue(flag);
		 */
		// Prepare new List
		List<String> collection = finalString.filter(s->s.startsWith("A")).collect(Collectors.toList());
		System.out.println(collection.get(1));

		// Print unique number in Array and sort it
		List<Integer> listArray = Arrays.asList(9, 7, 6, 2, 3, 2, 1, 7, 1, 2);
		listArray.stream().distinct().forEach(s->System.out.println(s));
	}

}
