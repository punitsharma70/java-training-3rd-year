public class month_name
{
	public static void main(String[] args) {
		if(args.length!=1)
		{
			System.out.println("Wrong Number of Command Line Arguments!\nExiting...");
			System.exit(0);
		}
		int month;
		String monthname="";
		month=Integer.parseInt(args[0]);
		switch(month)
		{
			case 1: monthname="January";
				  break;	
			case 2: monthname="February";
				  break;	
			case 3: monthname="March";
				  break;	
			case 4: monthname="April";
				  break;	
			case 5: monthname="May";
				  break;	
			case 6: monthname="June";
				  break;
			case 7: monthname="July";
				  break;	
			case 8: monthname="August";
				  break;	
			case 9: monthname="September";
				  break;	
			case 10: monthname="October";
				  break;	
			case 11: monthname="November";
				  break;	
			case 12: monthname="December";
				  break;		
			default: System.out.println("Invalid Month!");
				 System.exit(0);
		}
		System.out.println(monthname);
	}
}


