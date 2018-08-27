import java.util.Scanner;
public class ForLoops
	{

		public static void main(String[] args)
			{
				do
					{
						Scanner userInput = new Scanner(System.in);
						//change
						System.out.println("Which challenge (1-8) would you like to see?");
						int challengeNumber = userInput.nextInt();
						switch (challengeNumber)
						{
							case 1:
								showGeniusOne();
								break;
							case 2:
								showGeniusTwo();
								break;
							case 3:
								showGeniusThree();
								break;
							case 4:
								showGeniusFour();
								break;
							case 5:
								showGeniusFive();
								break;
							case 6:
								showGeniusSix();
								break;
							case 7:
								showGeniusSeven();
								break;
							case 8:
								showGeniusEight();
								break;
							
						}
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
			int total = 0;
			for (int i = 5; i <= 100; i = i + 5)
				{
					total = total + i;
				}
			System.out.println(total);
		}
		public static void showGeniusSix()
		{
			Scanner userBounds = new Scanner(System.in);
			System.out.println("Hi, user! Enter a lower bound.");
			int lowerBound = userBounds.nextInt();
			System.out.println("Okay, now enter an upper bound!");
			int upperBound = userBounds.nextInt();
			int total = 0;
			
			for (; lowerBound<=upperBound; lowerBound++)
				{
					total = total + lowerBound;
				}
			System.out.println(total);
		}
		public static void showGeniusSeven()
		{
			Scanner userBounds = new Scanner(System.in);
			System.out.println("Hi, user! Enter a lower bound.");
			int lowerBound = userBounds.nextInt();
			System.out.println("Okay, now enter an upper bound!");
			int upperBound = userBounds.nextInt();
			int total = 0;
			
			for (; lowerBound<=upperBound; lowerBound++)
				{
					if ((lowerBound % 3) == 0)
						{
							total = total + lowerBound;
						}
				}
			System.out.println(total);
		}
		public static void showGeniusEight()
		{
			System.out.println("********");
			
			for (int i = 0; i < 9; i++)
				{
					System.out.println("*      *");
				}
			
			System.out.println("********");
		}


		
	}
