package com.svkp.inheritance;

class Rectangle{
	int length=10;
	int breadth=5;
}
//subclass of rectangle
class cubiod extends Rectangle{
	int height=5;
	int volumeCubiod() {
	int area=length*breadth*height;
	return(area);
	}
}
//subclass of cubiod
class RectangleParameter extends cubiod{
	void paraMeter() {
		System.out.println("parameter="+(2*(length+breadth)));
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
	RectangleParameter obj=new RectangleParameter();
	System.out.println("voume of cubiod="+obj.volumeCubiod());
	obj.paraMeter();
	}
}
