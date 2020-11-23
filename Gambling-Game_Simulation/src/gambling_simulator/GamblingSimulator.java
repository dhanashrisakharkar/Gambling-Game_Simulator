package gambling_simulator;

import java.util.Random;

public class GamblingSimulator {
	public static final int stack = 100;
	public static final int bet = 1;
	public static int Win = 0;
	public static int Loose = 0;
	public static int TempStack = 50;
	public static int Total_Amount = 0;

	public void checkWinningLoose() {
		Random No = new Random();
		int randomNo = No.nextInt(2);
		if (randomNo == 0) {
			Win = bet;
			System.out.println("Gambler Is Winner" + Win);
		} else {
			Loose = bet;
			System.out.println("Gamler is not winner" + Loose);
		}
	}

	public int WinningLooseRange() {
		Random No = new Random();

		int tempstack = stack;
		while (tempstack > 50 && tempstack < 150) {
			int randomNo = No.nextInt(2);

			if (randomNo == 0) {
				tempstack = tempstack + bet;
				Win = bet;
				System.out.println("Gambler Is Winner" + Win);
			} else {
				tempstack = tempstack - bet;
				Loose = bet;
				System.out.println("Gamler is not winner" + Loose);
			}
		}
		System.out.println("Total Stack is : " + tempstack);
		return tempstack;
	}

	public void TotalAmountWinorLoss(int day) {
		for (int index = 0; index <= day; index++) {
			int temp = WinningLooseRange();
			if (temp - stack > 0) {
				Total_Amount = Total_Amount + (TempStack - stack);
				System.out.println("winnning day " + index + "Amount is" + Total_Amount);
			} else {
				Total_Amount = Total_Amount + (stack - TempStack);
				System.out.println("loosing days" + index + "Amount is " + Total_Amount);
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome To Gambling Simulator");
		GamblingSimulator gamblingSimulator = new GamblingSimulator();
		gamblingSimulator.checkWinningLoose();
		gamblingSimulator.WinningLooseRange();
		gamblingSimulator.TotalAmountWinorLoss(20);

	}

}
