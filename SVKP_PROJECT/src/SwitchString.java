
public class SwitchString {

	public static void main(String[] args) {
		String name = "author";
		switch(name.toLowerCase()){
		case "author":
			System.out.println("Venkateswara rao");
			break;
		case "team":
			System.out.println("java full stack team");
			break;
		default:
			System.out.println("inavalid entry");
			break;
		}

	}

}
