package Streams_LamdaExp;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class Stream_Practice_Demo {

	public static void main(String[] args) {
		// Print unique number in Array and sort it

		List<Integer> listArray = Arrays.asList(9, 7, 6, 2, 3, 2, 1, 7, 1, 2);
		List<Integer> sorted = listArray.stream().distinct().collect(Collectors.toList());
		
		sorted.stream().sorted().forEach(s->System.out.println());
		

	}

}
