import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class MatchingGame
{
		static ArrayList<String> loader = new ArrayList<String>();
		static String [][] displayBoard = new String [4][4];
		static String [][] answerBoard = new String [4][4];
		static int themeChoice;
		static int counter = 0;
		static Scanner userInput = new Scanner(System.in);
		private static int firstChoice;
		private static int secondChoice;
		
		static String faces [] = {"(:, (:, ):, ):, :D, :D, (;, (;, <3, <3, |:, |:, /:, /:, :O, :O"};
		static String animals [] = {"crab, crab, duck, duck, bird, bird, lion, lion, wolf, wolf, worm, worm, tuna, tuna, goat, goat"};
		
		public static void main(String[] args)
			{
				
			}
		
		
		public static void displayBoard()
		{
			System.out.println("    1      2      3      4   ");
			System.out.println("-----------------------------");
			System.out.println("A |  " + board[0][0] + "  |  " + board[1][1] + "  |  " + board[1][2] + "  |  " + board [1][3] + "  |");
			System.out.println("-----------------------------");
			System.out.println("B |  " + board[1][0] + "  |  " + board[1][1] + "  |  " + board[1][2] + "  |  " + board [1][3] + "  |");
			System.out.println("-----------------------------");
			System.out.println("C |  " + board[2][0] + "  |  " + board[2][1] + "  |  " + board[2][2] + "  |  " + board [2][3] + "  |");
			System.out.println("-----------------------------");
			System.out.println("D |  " + board[3][0] + "  |  " + board[3][1] + "  |  " + board[3][2] + "  |  " + board [3][3] + "  |");
			System.out.println("-----------------------------");
		}
		
		public static void fillGrid()
		{
			for (int row = 0; row < board.length; row++)
				{
					for (int col = 0; col < board.length; col++)
						{
							board[row][col] = " ";
						}
				}
		}
		
		public static void playerTheme()
		{
			System.out.println("Which theme would you like to choose from?");
			System.out.println("(1) faces");
			System.out.println("(2) animals");
			String themeChoice = userInput.nextLine();
			
			switch (themeChoice)
			{
			case 1:
			{
				for(String a : faces)
				{
				loader.add(a);
				}
				break;
			}
			case 2:
			{
				for(String a : animals)
				{
					loader.add(a);
				}
				break;
			}
			}
		}
	public static void orderAnswers();
	{
		playerTheme();
		shuffle();
		loadCards();
	}
	
	public static void loadcards()
	{
		Collections.shuffle(loader);
	}
	
	public static void loadCards()
	{
		int counter = 0;
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				answerBoard[i][j] = loader.get(counter);
				counter++;
			}
		}
	}
	
	public static void inputFirstChoice()
	{
		System.out.println("Please input your choice of card to flip over (ex: A1)");
		firstChoice = userinput.nextLine();
		switch (firstChoice.substring(0,1))
		{
		case "A";
		case "a";
		{
			firstRowChoice = 0;
			break;
		}
		case "B";
		case "b";
		{
			firstRowChoice = 1;
			break;
		}
		case "C";
		case "c";
		{
			firstRowChoice = 2;
			break;
		}
		case "D";
		case "d";
		{
			firstRowChoice = 3;
			break;
		}
		}
		
		firstColumnChoice = Integer.parseInt(firstChoice.substring(1)) - 1;
		System.out.println();
		Layout.layout[firstRowChoice][firstColumnChoice] =
						Themes.answerBoard[firstRowChoice][firstColumnChoice];
		Layout.displayBoard();
	}
	
	public static void inputSecondChoice()
	{
		System.out.println("Please input your choice of card to flip over (ex: A1)");
		secondChoice = userinput.nextLine();
		switch (secondChoice.substring(0,1))
		{
		case "A";
		case "a";
		{
			secondRowChoice = 0;
			break;
		}
		case "B";
		case "b";
		{
			secondRowChoice = 1;
			break;
		}
		case "C";
		case "c";
		{
			secondRowChoice = 2;
			break;
		}
		case "D";
		case "d";
		{
			secondRowChoice = 3;
			break;
		}
		}
		
		secondColumnChoice = Integer.parseInt(secondChoice.substring(1)) - 1;
		System.out.println();
		Layout.layout[secondRowChoice][firstColumnChoice] =
						Themes.answerBoard[secondRowChoice][seecondColumnChoice];
		PlayGame.numberOfAttempts++;
		Layout.displayBboard();
	}
	
	public static void comparechoices()
	{
		if (Layout.layout[firstRowChoice][firstColumnChoice].equals)	
								Layout.layout[secondRowChoice][secondColumnChoice]))
		{
			numberOfMatches++;
			if (numberOfMatches == 1)
			{
				System.out.println("You have " + numberOfMatches + " match.");
			}
			else
			{
				System.out.println("You have " + numberOfMatches + " matches.");
			}
		}
		else
		{
			try
			{
				TimeUnit.SECONDS.sleep(2);
			}
			catch (InterruptedException e)
			{
				//handles exception
			}
			Layout.layout[firstRowChoice][firstColumnChoice] = "   ";
			Layout.layout[secondRowChoice][secondColumnChoice] = "   ";
			Layout.displayBboard();
		}
	}
	
	
}

