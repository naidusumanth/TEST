package Testing;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Data {
	public static void main(String[] args) throws ParseException {
		
		 Date current = new Date(5);
		 
		 String myFormatString = "dd/MM/yyyy";
		
		   @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		   
		   System.out.println("Enter the date");
		   
		   myFormatString = s.nextLine();
		   
		   SimpleDateFormat df = new SimpleDateFormat(myFormatString);
		    
		    java.util.Date givenDate = df.parse(myFormatString);
		    
		    long r = givenDate.getTime();
		   
		    Date next = new Date(r);
		    
		    if((next.after(current))||next.equals(current)) {
		    	try
		    	{
		    		 System.out.println("The date is future day");
		    	}
		    	catch(Exception e)
		    	{
		    		
		    	}

		    } 
		    
		    else {

		        System.out.println("The date is older than current day");
		    }
		
	}

	}




