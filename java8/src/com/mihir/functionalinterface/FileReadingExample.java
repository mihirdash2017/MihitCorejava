package com.mihir.functionalinterface;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub homeofficeURL123
		String fileName = "c://homeofficeURL123.txt";
		List<String> list = new ArrayList<>();

		try (Stream<String> stream = Files.lines(Paths.get(fileName), StandardCharsets.ISO_8859_1)) {

			// 1. filter line 3
			// 2. convert all content to upper case
			// 3. convert it into a List
			
			Long count=Files.lines(Paths.get(fileName), StandardCharsets.ISO_8859_1).count();
			
			String str = stream.map(String::toUpperCase)
					.collect(Collectors.toList()).get(2);
					/*String upperCase = stream
					.flatMap(e->Arrays.stream(e.split("\n")))
					.collect(Collectors.toList())
					.get(2).toUpperCase();
					System.out.println(upperCase);*/
			/*list = stream1.map(String::toUpperCase)
					.collect(Collectors.toList());
					
*/
		System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		}

		list.forEach(System.out::println);

	}

}
