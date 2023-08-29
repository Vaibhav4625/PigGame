package homework.game.second;

import java.util.*;
public class PigGame {
	
    int scoreForTurn;
	int totalScore;
	
	int turn =0;
	
	PigGameTest occurance = new PigGameTest();
	
	public void gameLogic()
	
	{
		Scanner sc = new Scanner(System.in);
		
		
		scoreForTurn=0;
		
		totalScore=0;
		
		System.out.println("Let's Start the Game !!!!");
		
		while(totalScore<20)
		{
			turn++;
			
			System.out.println("Turn :- "+turn);
			while(true) {
			System.out.println("Roll OR Hold? r/h :- ");
			
			String option = sc.next();
			
			if(option .equalsIgnoreCase("r"))
			{
				int numberOccuredOnDice = occurance.rollTheDice();
				
				System.out.println("Number occured is :- "+numberOccuredOnDice);
				  
				  if(+numberOccuredOnDice == 1)
				  { 
					  System.out.println("Turn Over. No Score  ");
					  scoreForTurn =0;
					  break;
				  }
				  else
				  {
					  scoreForTurn += numberOccuredOnDice;
					  
				  }
			
			} 
		    else if(option .equalsIgnoreCase("h"))
			{
					
				totalScore += scoreForTurn; 
					
			    System.out.println("Score for turn = "+scoreForTurn);
			    System.out.println("Total score  = "+totalScore);
			    scoreForTurn =0;
			    break;
			    
			}
			
		    else
		    {
		    	System.out.println("Wrong turn!!!! Please Choose r/h :");
		    }
			}
		    	
		}
		
		System.out.println("You finished the game in "+turn+ " turns \n Game Over!!!!");
	}
	
	
	

}
