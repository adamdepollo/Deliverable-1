package dinnerPlanner;
import java.util.Scanner;

public class dinnerPlanner {
	public static void main (String[] args){
		Scanner scnr = new Scanner(System.in);
		String eventType;
		int partySize;
		String result;
		String mealSuggestion;
		String preparationSuggestion;
		int eventTypeValue = 0;
		
		System.out.println("Welcome to the Dinner Planner! What type of dinner are you planning? (Enter 'casual,' 'semi-formal,' or 'formal')");
		
		eventType = scnr.nextLine();
		
		System.out.println("Excellent, a " + eventType + " dinner. And how many people will be coming? (Enter a number 1 or larger)");
		
		partySize = scnr.nextInt();
		
		System.out.println("Wonderful, dinner for " + partySize + ".");
		
		System.out.println("Alright, let me think ...");
		
		
		if (partySize == 1) {
			preparationSuggestion = "in the microwave";
		}
		
		else if ((partySize > 1) && (partySize < 13)) {
			preparationSuggestion = "in your kitchen";
		}
		
		else {
			preparationSuggestion = "by a caterer";
		}
		
		switch (eventType) {
			case "casual":
				eventTypeValue = 1;
				break;
			case "semi-formal":
				eventTypeValue = 2;
				break;
			case "formal":
				eventTypeValue = 3;
				break;
		}
		
		if (eventTypeValue == 1) {
			mealSuggestion = "sandwiches";
		}
		else if (eventTypeValue == 2) {
			mealSuggestion = "fried chicken";
		}
		else {
			mealSuggestion = "chicken parmesan";
		}
		
		result = "Since you’re hosting a " + eventType + " dinner for a party of " + partySize + ", you should serve " + mealSuggestion + " prepared " + preparationSuggestion + ".";
		
		System.out.println(result);
		
	}
}
