import java.util.Scanner;

public class daysofMonth {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
        System.out.println("enter month name");
        String str=in.next();
        
       switch(str.toLowerCase()){
       case "january":
       case "march":
       case "may":
       case "july":
       case "august":
       case "october":
       case "december":
    	   System.out.println("number of days in"+" "+str+" "+"is:31days");
    	   break;
       case "april":
       case "june":
       case "september":
       case "november":
    	   System.out.println("number of days in"+" "+str+" "+"is:30days");
    	   break;
       case "february":
    	   System.out.println("number of days in"+" "+str+" "+"is:28days");
    	   break;
      default:
   	   System.out.println("no month exists");

       
       }
	}

}
