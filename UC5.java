
public class UC5 {
	static final int NoTurn = 0;
	static final int Ladder = 1;
	static final int Snake  = 2;
	static 		 int sum    = 0;

	public static void main(String[] args) {

		while (sum < 100) {
			int dice = (int) (Math.random() * 6) + 1;

			System.out.println("Dice Roll " +dice);

			int other = (int) Math.floor(Math.random() * 10) % 3;

			if (other == Ladder) {
				if (sum <= 100 && (sum + dice <= 100))
				sum = sum + dice;
				System.out.println("Ladder");
			}
			else if (other == Snake) {

				if (sum > 0 && (sum - dice) >= 0) {
					sum = (sum - dice);
					System.out.println("Snake");
				}
			}
			else {
				System.out.println("No Turn");
			}
		}
	}
}
