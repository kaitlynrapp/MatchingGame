import java.util.Scanner;

public class MatchingGame
	{
		static String [][] board = new String [4][4];
		static int randomCards;
		static Scanner userInput = new Scanner(System.in);
		private static int choice;
		 
		public static void main(String[] args)
			{
				fillGrid();
				displayBoard();
				askPlayer();
				askPlayer2();
				//isMatch();
				//while(!gameIsWon())
					{
						askPlayer();
					}
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
		
		public static void askPlayer()
			{

				System.out.println("Welcome user to the memory guessing game! The goal is to match two of the same cards. Once all matched you win! What card would you like to flip first?");
				String choice = userInput.nextLine();
				
				if (choice.equals("A1"))
					{
				board[0][0] = "(:"; //A1 match1
				displayBoard();
					}
				else if (choice.equals("A2"))
					{
				board[0][1] = "):"; //A2 match2
				displayBoard();
					}
				else if (choice.equals("A3"))
					{
				board[0][2] = "|:"; //A3 match3
				displayBoard();
					}
				else if (choice.equals("A4"))
					{
				board[0][3] = "(:"; //A4 match1
				displayBoard();
					}
				else if (choice.equals("B1"))
					{
				board[1][0] = "(;"; //B1 match5
				displayBoard();
					}
				else if (choice.equals("B2"))
					{
				board[1][1] = "(;"; //B2 match5
				displayBoard();
					}
				else if (choice.equals("B3"))
					{
				board[1][2] = "/:"; //B3 match4
				displayBoard();
					}
				else if (choice.equals("B4"))
					{
				board[1][3] = "<3"; //B4 match6
				displayBoard();
					}
				else if (choice.equals("C1"))
					{
				board[2][0] = ":D"; //C1 match7
				displayBoard();
					}
				else if (choice.equals("C2"))
					{
				board[2][1] = "):"; //C2 match2
				displayBoard();
					}
				else if (choice.equals("C3"))
					{
				board[2][2] = "<3"; //C3 match6
				displayBoard();
					}
				else if (choice.equals("C4"))
					{
				board[2][3] = "$D"; //C4 match8
				displayBoard();
					}
				else if (choice.equals("D1"))
					{
				board[3][0] = "/:"; //D1 match4
				displayBoard();
					}
				else if (choice.equals("D2"))
					{
				board[3][1] = "$D"; //D2 match8
				displayBoard();
					}
				else if (choice.equals("D3"))
					{
				board[3][2] = ":D"; //D3 match7
				displayBoard();
					}
				else if (choice.equals("D4"))
					{
				board[3][3] = "|:"; //D4 match3
				displayBoard();
					}
				else
					{
						System.out.println("That is not a coordinate try again.");
					}
						}
		
		public static void askPlayer2()
		{
			System.out.println("Select another card.");
			String choice2 = userInput.nextLine();
			
			if (choice2.equals("A1"))
				{
			board[0][0] = "(:"; //A1 match1
			displayBoard();
				}
			else if (choice2.equals("A2"))
				{
			board[0][1] = "):"; //A2 match2
			displayBoard();
				}
			else if (choice2.equals("A3"))
				{
			board[0][2] = "|:"; //A3 match3
			displayBoard();
				}
			else if (choice2.equals("A4"))
				{
			board[0][3] = "(:"; //A4 match1
			displayBoard();
				}
			else if (choice2.equals("B1"))
				{
			board[1][0] = "(;"; //B1 match5
			displayBoard();
				}
			else if (choice2.equals("B2"))
				{
			board[1][1] = "(;"; //B2 match5
			displayBoard();
				}
			else if (choice2.equals("B3"))
				{
			board[1][2] = "/:"; //B3 match4
			displayBoard();
				}
			else if (choice2.equals("B4"))
				{
			board[1][3] = "<3"; //B4 match6\
			displayBoard();
				}
			else if (choice2.equals("C1"))
				{
			board[2][0] = ":D"; //C1 match7
			displayBoard();
				}
			else if (choice2.equals("C2"))
				{
			board[2][1] = "):"; //C2 match2
			displayBoard();
				}
			else if (choice2.equals("C3"))
				{
			board[2][2] = "<3"; //C3 match6
			displayBoard();
				}
			else if (choice2.equals("C4"))
				{
			board[2][3] = "$D"; //C4 match8
			displayBoard();
				}
			else if (choice2.equals("D1"))
				{
			board[3][0] = "/:"; //D1 match4
			displayBoard();
				}
			else if (choice2.equals("D2"))
				{
			board[3][1] = "$D"; //D2 match8
			displayBoard();
				}
			else if (choice2.equals("D3"))
				{
			board[3][2] = ":D"; //D3 match7
			displayBoard();
				}
			else if (choice2.equals("D4"))
				{
			board[3][3] = "|:"; //D4 match3
			displayBoard();
				}
			else
				{
					System.out.println("That is not a coordinate try again.");
				}
			displayBoard();
		}
		
	
	}


	}
	
