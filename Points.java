
public class Points extends SoccerTeam {
	public Points(int numberOfWins, int numberOfLose, int numberofTies) {
		super(numberOfWins, numberOfLose, numberofTies);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println ("Play");
		
		SoccerTeam Game1 = new SoccerTeam (1, 1, 1);
		SoccerTeam Game2 = new SoccerTeam (3, 6 , 7);
		SoccerTeam Game3 = new SoccerTeam (6, 8 , 9 );
		SoccerTeam Game4 = new SoccerTeam (2, 8 , 9);
		
		SoccerTeam.startTournament ();
		
		System.out.println("First");
		
		System.out.println("Number of Games Play: 4");

		System.out.println("Total Games played is " +SoccerTeam.Games());

		System.out.println( "First Team ");

		System.out.println( " Points: " + Game1.getNumberOfPoints());
		
		System.out.println( "Second Team ");

		System.out.println( " Points: " + Game2.getNumberOfPoints());
		System.out.println( "Third Team ");

		System.out.println( " Points: " + Game3.getNumberOfPoints());
		
		System.out.println( "Last Team ");

		System.out.println( " Points: " + Game4.getNumberOfPoints());
		
		Game1.reset (); 
		Game2.reset (); 
		Game3.reset (); 
		Game4.reset (); 
	}
}
