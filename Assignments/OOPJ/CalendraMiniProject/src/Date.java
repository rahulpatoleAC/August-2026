public class Date {

	private int day;
	private int month;
	private int year;
	private int totalDays;
	private int totalMonths;
	private int[] arr = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };   //28/5/2026

	void callLeapYear(int yyyy) {

		if (yyyy % 4 == 0) {
			arr[2] = 29;
		}
	}

	// Setter
	public void setDate(int dd, int mm, int yyyy) {

		// Year Validation

		callLeapYear(yyyy);
		year = yyyy;

		// Month Validation
		if (mm < 1 || mm > 12) {
			month = 1;
		} else {
			month = mm;
		}


		// Day Validation
		if (dd < 1 || dd > arr[mm]) {
			day = 1;
		} else {
			day = dd;
		}

	}

	// Add Days
	public void addDays(int addedDays) 
	{
		totalDays = day + addedDays; 

		                               
		while (totalDays > arr[month]) 
		{
			callLeapYear(year);

			totalDays = totalDays - arr[month]; 
			month++; 

			if (month > 12) {
				month = 1;
				year++;
			}

		}

		day = totalDays;
	}

	
	
	// Set Month
	public void addMonth(int addedMonth) {    
		callLeapYear(year);
		
		 totalMonths = month + addedMonth;      
		
	    while (totalMonths > 12) {
	        totalMonths = totalMonths - 12;
	        year++;
	    }

	    month = totalMonths;
		
		int totalDaysInMonth = 0;				

				for(int iTemp = month + 1; iTemp <= totalMonths; iTemp++) {
				   totalDaysInMonth += arr[iTemp];
				}
				
				addDays(totalDaysInMonth);
				
	}
	
	
	// Set Year
	public void addYear(int addedYear) {
		int monthsInAddedYear = 12 * addedYear;
		
		addMonth(monthsInAddedYear);
		
		
	}

	// Gettor
	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

}
