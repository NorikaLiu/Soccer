
public class SoccerTeam {
	private int numberOfPoint = 0;
	private int numberofTies = 0;
	private int numberOfWins = 0;
	private int numberOfLose = 0;
	private int myScore;
	private int opponentscore;
	private static int game;
	public static int Goals;
	
	//public void myScore () {
	//	myScore++;	

//	}
//	public void opponentScore () {
	//	opponentscore++;	

	//}
	public static void startTournament (){ 
		game = 0;
		Goals= 0;
		
		
	}
	public SoccerTeam (int numberOfWins, int numberOfLose, int numberofTies) {
		this.numberOfWins = numberOfWins;
		this.numberOfLose = numberOfLose;
		this.numberofTies = numberofTies;
		
	}
		
public void played ( SoccerTeam opponent,  int myScore, int opponentscore) {
	game++
	
	;
Goals = Goals + myScore + opponentscore;

	if  (myScore > opponentscore) {
		numberOfWins++;
	}
	if  (opponentscore > myScore) {
		numberOfLose++;
	}
	if  (opponentscore == myScore) {
		numberofTies++;
	}

}
public static int Games () {
	return game;
	
	
	
} 
public static int Goal () {
	return Goals;
}
//public static void main (String args [] ){ 
	
	
//}
public int getNumberOfPoints() {

	numberOfPoint = (numberOfWins * 3) + numberofTies;
	return numberOfPoint; 
}
public void reset () {
	numberOfPoint = 0;
	
}
	
	

}
