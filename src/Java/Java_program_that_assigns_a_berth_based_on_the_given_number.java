package Java;

import java.util.Scanner;

public class Java_program_that_assigns_a_berth_based_on_the_given_number 
{
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the berth number: ");
	        int berthNumber = scanner.nextInt();

	        assignBerth(berthNumber);

	        scanner.close();
	    }

	    public static void assignBerth(int berthNumber) {
	        int compartment = (berthNumber - 1) / 8 + 1;
	        int position = (berthNumber - 1) % 8 + 1;

	        String berthType = "";
	        if (position == 1 || position == 4 || position == 5 || position == 8) {
	            berthType = "Lower Berth";
	        } else if (position == 2 || position == 7) {
	            berthType = "Middle Berth";
	        } else if (position == 3 || position == 6) {
	            berthType = "Upper Berth";
	        } else {
	            berthType = "Side Upper Berth";
	        }

	        System.out.println("The berth " + berthNumber + " is in Compartment " + compartment +
	                " and it is a " + berthType);
	    }
	}

