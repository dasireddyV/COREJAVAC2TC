package com.svkp.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class employSort {

	public static void main(String[] args) {
		ArrayList<EmployData> el=new ArrayList<EmployData>();
		el.add(new EmployData("Vijay",121,23));
		el.add(new EmployData("Varun",123,24));
		el.add(new EmployData("Kishore",122,22));
		Comparator<EmployData> e1=Comparator.comparing(EmployData::getAge);
		Comparator<EmployData> e2=Comparator.comparing(EmployData::getEname);
		Collections.sort(el,e1);
		System.out.println("****sort by age****");
		for(EmployData e:el) {
			System.out.println(e.ename+" "+e.eid+" "+e.age);
		}
		System.out.println("****sort by name****");
		Collections.sort(el,e2);
		for(EmployData a:el) {
			System.out.println(a.ename+" "+a.eid+" "+a.age);
		}
	}

} 
