import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Route route = new Route();

		System.out.println("Bitte wählen Sie ein Verkehrsmittel zur Routenberechnung aus:");
		System.out.println("1 = Auto");
		System.out.println("2 = Öffentliche Verkehrsmittel");
		System.out.println("3 = Fahrrad");
		
		
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.next();
		int userInputNumber = 0;
		try {
			userInputNumber = Integer.parseInt(userInput);
		}
		catch (NumberFormatException e) {
			userInputNumber = 0;
		}
		
		switch (userInputNumber) {
		case 0:
			System.out.println("Keine gültige Auswahl. Bitte wählen Sie eine Zahl von 1-3 aus.");
			break;
		case 1:
			route.setRouting(new CarRouting());
			route.createRoute();
			break;
		case 2: 
			route.setRouting(new PublicTransportRouting());
			route.createRoute();
			break;
		case 3:
			route.setRouting(new BikeRouting());
			route.createRoute();
			break;
		}

	}

}