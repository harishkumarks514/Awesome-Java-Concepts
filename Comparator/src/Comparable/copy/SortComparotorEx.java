package Comparable.copy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
	int age;
	String name;

	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

}

public class SortComparotorEx {

	public static void main(String[] args) {

		Comparator<Student> com = ( i,  j) -> i.age > j.age ? 1 : -1;

		List<Student> studs = new ArrayList<>();
		studs.add(new Student(4, "Harish"));
		studs.add(new Student(28, "Abhi"));
		studs.add(new Student(34, "Sayan"));
		studs.add(new Student(38, "Darshan"));
		studs.add(new Student(13, "Sharath"));

		Collections.sort(studs, com);

		for (Student s : studs)
			System.out.println(s);
	}

}