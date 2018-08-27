import java.util.Scanner;
public class ForLoops
	{

		public static void main(String[] args)
			{
				do
					{
						Scanner userInput = new Scanner(System.in);
						
						System.out.println("Which challenge (1-8) would you like to see?");
						int challengeNumber = userInput.nextInt();
						showGeniusFour();
						System.out.print("\n");
					}
				while (true);
				
			}
		public static void showGeniusOne()
		{
			for (int i = 1; i <= 5; i++)
				{
					System.out.println(i);
				}
		}
		public static void showGeniusTwo()
		{
			for (int i = 2; i <= 10; i = i + 2)
				{
					System.out.println(i + ") I love Mullen!");
				}
		}
		public static void showGeniusThree()
		{
			for (int i = 1; i <= 5; i++)
				{
					System.out.print(i + " ");
				}
		}
		public static void showGeniusFour()
		{
			for (int i = 10; i > 0; i--)
				{
					System.out.println(i);
				}
			System.out.println("Liftoff!");
		}
		public static void showGeniusFive()
		{
			
		}
		public static void showGeniusSix()
		{
			
		}
		public static void showGeniusSeven()
		{
			
		}
		public static void showGeniusEight()
		{
			
		}


		
	}
