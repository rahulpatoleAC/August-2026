

public class Calendar {
	
	public static void main(String[] args) {
		int menuNo;
		
		Date objDate = new Date();
		
		
		do {
			System.out.println("\n========= MENU-DRIVEN =========");
			System.out.println("1. SetDate");
			System.out.println("2. AddDay");
			System.out.println("3. AddMonth");
			System.out.println("4. SetYear");
			System.out.println("5. Display");
			System.out.println("6. CompareDate");
			System.out.println("7. Exit");
			
			System.out.println("--------------------------------");
			System.out.println("Enter Menu No: ");
			menuNo = ConsoleInput.getInt();
			
			  switch(menuNo) {
			    case 1: {
			    	System.out.println("Enter Day: ");
			    	int day = ConsoleInput.getInt();
			    	
			    	System.out.println("Enter Month: ");
			    	int month = ConsoleInput.getInt();
			    	
			    	System.out.println("Enter Year: ");
			    	int year = ConsoleInput.getInt();
			    	
			    	objDate.setDate(day, month, year);
			    	
			    	System.out.println("Set Date Successfully");
			    	
			    	break;
			    }
			    
			    case 2: {
			    	System.out.println("\nHow Many Days to Add: ");
					int addedDays = ConsoleInput.getInt();
					objDate.addDays(addedDays);
					System.out.println("\nAdded Day Successfully");
					
					break;
			    }
			    
			    case 3: {
			    	System.out.println("\nHow Many Months to Add: ");
					int addedMonth = ConsoleInput.getInt();
					objDate.addMonth(addedMonth);
					System.out.println("\nAdded Months Successfully");
					
					break;
			    }
			    
			    case 4: {
			    	System.out.println("\nHow Many Years to Add: ");
					int addedYear = ConsoleInput.getInt();					
					objDate.addYear(addedYear);	
					System.out.println("\nAdded Months Successfully");
					
					break;
			    }
			    
			    case 5: {
			    	System.out.println(objDate.getDay() + "/" + objDate.getMonth() + "/" + objDate.getYear());
			    	System.out.println("Display Successfully");

			    	break;
			    }
			    
			    case 6: {
			    	System.out.println("In Progress........");
					break;

			    }
			    
			    case 7: {
			    	break;
			    }
			    
			    default:
			    	System.out.println("Invalid Menu");
			  }
			
		} while(menuNo != 7);
		
	}
		

}
