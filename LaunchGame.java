package in.neuron.main;
import java.util.*;

class Guesser
{
	int guessNum;
	
	int guessNum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Guesser Kindly guess the number");
		guessNum=sc.nextInt();
		return guessNum;
	}
}


class Player
{
	int guessNum;
	
	int guessNum1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Player1 Kindly guess the number");
		guessNum=sc.nextInt();
		return guessNum;
	}
	int guessNum2()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Player2 Kindly guess the number");
		guessNum=sc.nextInt();
		return guessNum;
	}
	int guessNum3()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Player3 Kindly guess the number");
		guessNum=sc.nextInt();
		return guessNum;
	}
	
}


class Empire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void CollectNumFromGuesser()
	{
		Guesser g = new Guesser();
		numFromGuesser=g.guessNum();
	}
	void CollectNumFromPlayers()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		
		numFromPlayer1=p1.guessNum1();
		numFromPlayer2=p2.guessNum2();
		numFromPlayer3=p3.guessNum3();
	}
	void Compare()
	{
		if(numFromGuesser == numFromPlayer1)
		{
			if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3)
			{
				System.out.println("All Players won the Game");
			}
			else 
			{
			System.out.println("Player1 has won the Game");
			}
		}
		else if(numFromGuesser == numFromPlayer2)
		{
			if(numFromGuesser == numFromPlayer2 || numFromGuesser == numFromPlayer3) 
			{
				System.out.println("player2 and player3 both has to came");
			}
			else
			{
			System.out.println("Player2 has won the Game");
			}
		}
		else if(numFromGuesser == numFromPlayer3)
		{
			System.out.println("Player3 has won the Game");
		}
		else
		{
			System.out.println("Game lost Try again");
		}
	}
	
}


public class LaunchGame {

	public static void main(String[] args) {
		
		Empire E=new Empire();
		E.CollectNumFromGuesser();
		E.CollectNumFromPlayers();
		E.Compare();
		
	}

}
