package AssPart2;


import java.util.Scanner;

public class AirlineReservationSystem {
	
	//Main Methos++++++++++++++++++++++++++++++++++++++++++
	public static void main(String[] args) {
		//Create menu
		Integer reservedSeat = null;
		Scanner scan = new Scanner(System.in);
		System.out
				.println("Welcome to Centennial Airline Reservations System ");
		System.out.println("_________________________________________");
		System.out.println("1 for First Class");
		System.out.println("2 for Economy");
		System.out.println("3 for Exit");
		System.out.println("------------------------------------------");
		int num = -1;
		Airline ariline = new Airline();
		do {
			num = scan.nextInt();
			if (num == 1) {
				SeatType s = SeatType.FIRSTCLASS;
				reservedSeat = ariline.makeReservation(s);
				if (reservedSeat == null) {
					System.out.println("Next flight is in 3 hours.");
					System.exit(0);
				} else {
					System.out
							.println("You reservation is confirmed and your sear no is "
									+ reservedSeat);
				}
			} else if (num == 2) {
				SeatType s = SeatType.ECONOMY;
				reservedSeat = ariline.makeReservation(s);
				if (reservedSeat == null) {
					System.out.println("Next flight is in 3 hours.");
					System.exit(0);
				} else {
					System.out
							.println("You reservation is confirmed and your sear no is "
									+ reservedSeat);
				}
			}
			if (num != 3) {
				System.out
						.println("------------------------------------------");
				System.out.println("1 for First Class");
				System.out.println("2 for Economy");
				System.out.println("3 for Exit");
				System.out
						.println("------------------------------------------");
			}
		} while (num != 3);
		System.out.println("Bye !!!");
	}
}

