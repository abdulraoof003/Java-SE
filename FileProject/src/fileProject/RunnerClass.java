package fileProject;

import java.time.Clock;

public class RunnerClass {

	public static void main(String[] args) {

		Working_With_Files w_W_F = new Working_With_Files();

//		person p1 = new person("bobs", 1, "String1");
//
//		w_W_F.add_Vehicle(p1);
//
//		person p2 = new person("bob", 2, "String2");
//
//		w_W_F.add_Vehicle(p2);
//
//		person p3 = new person("bo", 3, "String3");
//
//		w_W_F.add_Vehicle(p3);
//
//		person p4 = new person("b", 4, "String4");
//
//		w_W_F.add_Vehicle(p4);
//
//		person p5 = new person("~", 5, "String5");
//
//		w_W_F.add_Vehicle(p5);

		
		// writing to the file
		System.out.println(w_W_F.to_File("person"));

		
		
		//System.out.println(w_W_F.from_File("person"));

		System.out.println(w_W_F.bobs);

	}

}