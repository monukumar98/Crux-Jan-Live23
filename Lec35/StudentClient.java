package Lec35;

import java.util.ArrayList;

public class StudentClient {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
//		ArrayList<Integer> ll = new ArrayList<>();
//		ll.add(10);
//		ArrayList<Integer> ll1 = new ArrayList<>();
//		ll1.add(5);
		System.out.println("Hey Bhai log");
		Student s = new Student();
		s.name = "Mohini";
		s.age = 20;
		s.Intro_yourSelf();
		Student s1 = new Student();
		s1.name = "Hunir";
		s1.age = 25;
		s1.Intro_yourSelf();
		s1.SayHey("Raja");
		s.SayHey("Raja");
		Student.fun();
		s.fun();
		s1.fun();

	}

	

}
