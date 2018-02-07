
/**
 * @author Nathan Bradley
 * Date:
 * Assignment:
 */
import java.util.Scanner;

public class DiceRollNB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, rolls, num1 = 0, counter1 = 0, counter2 = 0, counter3 = 0, counter4 = 0, counter5 = 0, counter6 = 0;
		double percent1 = 0, percent2 = 0, percent3 = 0, percent4 = 0, percent5 = 0, percent6 = 0;
		System.out.println("How many times do you want to roll the die? (enter 0 to quit) ");
		n = sc.nextInt();
		while (n != 0) {
			for (int i = 1; i <= n; i++) {
				num1 = (int) (6 * Math.random() + 1);
				if (num1 == 1) {
					counter1++;
				} else if (num1 == 2) {
					counter2++;
				} else if (num1 == 3) {
					counter3++;
				} else if (num1 == 4) {
					counter4++;
				} else if (num1 == 5) {
					counter5++;
				} else if (num1 == 6) {
					counter6++;
				}
				percent1 = counter1 / (n * .01);
				percent2 = counter2 / (n * .01);
				percent3 = counter3 / (n * .01);
				percent4 = counter4 / (n * .01);
				percent5 = counter5 / (n * .01);
				percent6 = counter6 / (n * .01);

			}
			
			System.out.println("1: " + counter1 + "(" + percent1 + "%)");
			System.out.println("2: " + counter2 + "(" + percent2 + "%)");
			System.out.println("3: " + counter3 + "(" + percent3 + "%)");
			System.out.println("4: " + counter4 + "(" + percent4 + "%)");
			System.out.println("5: " + counter5 + "(" + percent5 + "%)");
			System.out.println("6: " + counter6 + "(" + percent6 + "%)");
			counter1 = 0;
			counter2 = 0;
			counter3 = 0;
			counter4 = 0;
			counter5 = 0;
			counter6 = 0;
			System.out.println("How many times do you want to roll the die? (enter 0 to quit) ");
			n = sc.nextInt();
		}

	}
}
/*
How many times do you want to roll the die? (enter 0 to quit) 
10
1: 1(10.0%)
2: 1(10.0%)
3: 1(10.0%)
4: 5(50.0%)
5: 0(0.0%)
6: 2(20.0%)
How many times do you want to roll the die? (enter 0 to quit) 
100
1: 16(16.0%)
2: 14(14.0%)
3: 14(14.0%)
4: 15(15.0%)
5: 21(21.0%)
6: 20(20.0%)
How many times do you want to roll the die? (enter 0 to quit) 
0
*/