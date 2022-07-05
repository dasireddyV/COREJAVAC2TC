class studentData{
	int rollno;
	String name;
	static String college="svkp college";
	studentData(int r,String n){
		rollno=r;
		name=n;
	}
	void dispaly() {
		System.out.println(rollno+" "+name+" "+college);
	}
}
public class Demostatic {

	public static void main(String[] args) {
	studentData obj=new studentData(101,"venky");
	obj.dispaly();
		
	}

}
