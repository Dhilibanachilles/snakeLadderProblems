
public class UC3 {
	static int noTurn = 0;
	static int ladder = 1;
	static int snake = 2;
	static int Sum = 0;


	public static void main(String[] args) {
			int dice = (int) (Math.random() * 6) + 1;

			System.out.println("Dice Roll is " + dice);

			int opt = (int) Math.floor(Math.random() * 10) % 3;

			if (opt == ladder) {
					Sum = Sum + dice;
				System.out.println("Ladder");
			} 
			else if (opt == snake) {

					Sum = Sum - dice;
					System.out.println("Snake");

			} 
			else {
				System.out.println("NoTurn");
			}

	}

}
