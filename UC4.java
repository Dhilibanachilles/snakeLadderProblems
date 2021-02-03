
public class UC4 {
	static final int NoTurn = 0;
	static final int Ladder = 1;
	static final int Snake  = 2;
	static 		 int Sum    = 0;

	public static void main(String[] args) {

		while (Sum < 100) {

			int dice = (int) (Math.random() * 6) + 1;

			System.out.println("Dice ROll "+dice+".");

			int other = (int) Math.floor(Math.random() * 10) % 3;

			if (other == Ladder) {
				Sum = (Sum + dice);
				System.out.println("Ladder");
		   }
			else if (other == Snake) {

				if (Sum > 0 && (Sum - dice) >= 0) {
					Sum = Sum - dice;
					System.out.println("Snake");
				}

			}
			else {
				System.out.println("No Turn");
			}
		}
	}
}
