import java.util.ArrayList;
import java.util.Collections;

import com.svkp.collections.Student;
public class CollectionSort {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(103,"venky",22));
		al.add(new Student(102,"vivek",21));
		al.add(new Student(101,"ajay",23));
		Collections.sort(al);
		for(Student st:al) {
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
	}

}
