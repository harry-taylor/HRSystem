import java.util.*;

public class CasualWorker extends Staff {

	public int option = 0;
	
	public CasualWorker(String name, String rmitID, String password, String school, int phone, int workingHours) {
		super(name, rmitID, password, school, phone, workingHours);
	}

	// Declare variables

	// State unavailable hours
	@Override
	public void menu() {
		int option = this.option;
		int availableHrs;
		Scanner scan = new Scanner(System.in);
		
		do {

			System.out.println("Welcome casual worker!");
			System.out.println("1. State available hours");
			System.out.println("2. See open hours");
			System.out.println("3. Apply for a course");
			System.out.println();
			System.out.println("Please select an option: ");
			option = scan.nextInt();
		} while (option < 0 || option >= 3);

		if (option == 1)
		{
			System.out.println("Please enter available hours: ");
			this.option=1;
		}

		if (option == 2)
			this.option=2;
			System.out.println("See open hours");

		if (option == 3)
			this.option=2;
			System.out.println("Apply for a course");

	}
	
	public int getOption()
	{
		return this.option;
		
	}


}
