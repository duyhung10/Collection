package map;

import java.awt.RenderingHints.Key;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MapExample3 {
	public static void main(String[] args) {
		int id;
		String name;
		Scanner scanner = new Scanner(System.in);

		Map<Integer, String> mapStudents = new TreeMap<>();

		mapStudents.put(2, "James");
		mapStudents.put(4, "David");
		mapStudents.put(1, "Green");
		mapStudents.put(7, "Sky");

		System.out.println("Student List");
		System.out.println("id / name:");

		mapStudents.forEach((keyStr, valueStr) -> System.out.println(keyStr + " / " + valueStr));

		// Add new student
		System.out.println("\nAdd new student.");

		System.out.println("Input Student's id: ");
		id = Integer.parseInt(scanner.nextLine());
		System.out.println("Input Student's name: ");
		name = scanner.nextLine();

		if (mapStudents.containsKey(id)) {
			System.out.println("id = " + id + " existed!");
		} else {
			mapStudents.put(id, name);

			System.out.println("\nStudent List");
			System.out.println("id / name:");

			mapStudents.forEach((keyStr, valueStr) -> System.out.println(keyStr + " / " + valueStr));
			System.out.println();
		}
		
		// Find student by id
		id = 2;
		System.out.println(mapStudents.get(2));
		System.out.println();
		
		// Checks by student's name
		name = "David";
		if(mapStudents.containsValue(name)) {
			System.out.println(name + " existed.");
		}

	}
}
