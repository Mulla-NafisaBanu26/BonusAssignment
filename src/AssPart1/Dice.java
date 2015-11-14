package AssPart1;

public class Dice {
	//Declare final and array variable+++++++++++++++++++++++++++++++++++++++
	public static final int DICE_ROLLS = 36000;
	public static int[] frequencies;

	//Create method roll++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private static int roll() {
		return (int) ((Math.random() * 6) + 1);
	}

	//Create method rolltwodice+++++++++++++++++++++++++++++++++++++++++++++++
	private static int rollTwoDice() {
		return roll() + roll();
	}

	//create method for rolling dice with switch case statement++++++++++++++++++
	public static void rollDice36000Times() {
		frequencies = new int[11];
		Integer sumOfTwoDice = 0;
		for (int i = 0; i < DICE_ROLLS; i++) {
			sumOfTwoDice = rollTwoDice();
			switch (sumOfTwoDice) {
			case 2:
				frequencies[0]++;
				break;

			case 3:
				frequencies[1]++;
				break;

			case 4:
				frequencies[2]++;
				break;

			case 5:
				frequencies[3]++;
				break;

			case 6:
				frequencies[4]++;
				break;

			case 7:
				frequencies[5]++;
				break;

			case 8:
				frequencies[6]++;
				break;

			case 9:
				frequencies[7]++;
				break;

			case 10:
				frequencies[8]++;
				break;

			case 11:
				frequencies[9]++;
				break;

			case 12:
				frequencies[10]++;
				break;

			default:
				break;
			}
		}

	}

	//Display the Result+++++++++++++++++++++++++++++++++++++++
	public static void displayResult() {
		for (int i = 0; i < 11; i++) {
			System.out.println("when dice throws, sum "+(i+2)+ " is occured "+ frequencies[i]);
		}
	}

}

