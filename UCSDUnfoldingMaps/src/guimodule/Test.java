package guimodule;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		
		Student s = new Student();
		Person p = new Person();
		Person q = new Person();
		Faculty f = new Faculty();
		Object o = new Faculty();
		
		
		
		String n = s.getName();
		p = s;
		int m = ((Student)p).getID();
		
	
	}

}
