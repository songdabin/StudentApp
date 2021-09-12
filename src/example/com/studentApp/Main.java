package example.com.studentApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Student> al = new ArrayList<Student>();
		System.out.println("Student List (ordered by name)");
		al.add(new Student(101, "Kim", 23));
		al.add(new Student(102, "Choi", 21));
		al.add(new Student(103, "Park", 25));
		al.add(new Student(104, "Song", 22));
		al.add(new Student(105, "Han", 23));
		al.add(new Student(106, "Lee", 27));
		al.add(new Student(107, "Do", 24));
		al.add(new Student(108, "Jung", 28));
		al.add(new Student(109, "Jeon", 20));
		al.add(new Student(110, "Shin", 29));
		
		Collections.sort(al);
		
		for (Student s : al) {
			System.out.println(s.toString());
		}
		System.out.println("Student List (reverse ordered by name)");
		
		Collections.sort(al, Collections.reverseOrder());
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i).toString());
		}
	}

}
