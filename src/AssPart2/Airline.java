package AssPart2;

import java.util.Scanner;

public class Airline {
	boolean[] seats;
	Scanner input = new Scanner(System.in);
	private final static int FIRSTCLASSSTART = 1, ECONOMYSTART = 12,
			CAPECITY = 10;
	private boolean free = true;
	//Constructor++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public Airline() {
		seats = new boolean[FIRSTCLASSSTART + (2 * CAPECITY)];
	}

	//Create method try reservation
	private Integer tryReservation(SeatType s) {
		Integer reservation = null;
		int start = (s == SeatType.FIRSTCLASS) ? FIRSTCLASSSTART : ECONOMYSTART;
		int stop = start + CAPECITY;
		for (int number = start; number < stop; number += 1) {
			if (seats[number] == !free) {
				seats[number] = free;
				reservation = number;
				break;
			}
		}
		return reservation;
	}

	//Create method makereservation
	public Integer makeReservation(SeatType s) {
		Integer reservedSeat = tryReservation(s);
		if (reservedSeat == null) {
			SeatType alternative = getAlternative(s);
			reservedSeat = tryReservation(alternative);
		}
		return reservedSeat;
	}

	//Create method getAlternatives
	private SeatType getAlternative(SeatType s) {
		return (s == SeatType.FIRSTCLASS) ? SeatType.ECONOMY
				: SeatType.FIRSTCLASS;
	}

}