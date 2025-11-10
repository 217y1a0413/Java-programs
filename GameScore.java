package com.codegnan.oopexamples;

import java.util.Scanner;

public class GameScore {
	 public static int calculateTotalPoint(int totalGames) {
		 //calculate base points
		 int points=totalGames*10;
		 
		 //validate :if points exceeds 10000 cap to 10000
		 if(points>10000) {
			 points=10000;
		 }
		 return points;
	 }
	 //non-static method:calculate points for specific game type
 public int calculateGameTypePoints(int games,String gameType) {
	 int points=0;
	 if(gameType.equalsIgnoreCase("puzzles")) {
		 points=games*15;
	 }else {
		 if(gameType.equalsIgnoreCase("Action")) {
			 points=games*20;
		 }
	 }
	 if(points>10000) {
		 points=10000;
	 }
	 return points;
 }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int totalGames=sc.nextInt();//read static mehod
		int games=sc.nextInt(); //read non-static
		sc.nextLine();
		String gameType=sc.nextLine();
		
		//call static method directly using the class
		System.out.println(GameScore.calculateTotalPoint(totalGames));
		
		GameScore gs=new GameScore();
		System.out.println(gs.calculateGameTypePoints(games,gameType));
		sc.close();
		

	}

}
