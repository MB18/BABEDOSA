package testsprint;

import metier.Dancer;
import metier.TennisPlayer;
import metier.Tournament;


public class US2 {

	public static void main(String[] args) {
		System.out.println("******************Test SPRINT 2 ********************");
		System.out.println();
		System.out.println("********Test 1********");
		Tournament tournoiInter = new Tournament ("TournoiInternationale", "France", 1000);
		TennisPlayer tennisPlayer1 = new TennisPlayer("Nicole", "Pearson", "academyDauphine", 24, "Nicky", "Tennis", 1500);	
		tournoiInter.TournamentParticipation(tennisPlayer1);
		System.out.println("____________________");
		System.out.println();
		System.out.println("********Test 2********");
		TennisPlayer tennisPlayer2 = new TennisPlayer("Thomas", "Catton","academyDauphine", 24, "Tom", "Tennis", 3000);
		tournoiInter.TournamentParticipation(tennisPlayer2);
		System.out.println("____________________");
		System.out.println();
		System.out.println("********Test 3********");
		Dancer dancer = new Dancer("Thomas", "Catton", "Academy Dauphine", 24, "Dance", "Tom", "Hip Hop", 6, "hello", "Bye");
		if (dancer.CheckWarmUpTime())
			System.out.println(dancer.getName() + " have finished his enternment");
		else
			System.out.println(dancer.getName() + " have to finished his enternment");
		System.out.println("____________________");
		System.out.println();

		System.out.println("********Test 4********");
		Dancer dancer2 = new Dancer("Etienne", "Catton", "Academy Dauphine", 24, "Dance", "Tom", "Hip Hop", 1000, "hello", "Bye");
		if (dancer2.CheckWarmUpTime())
			System.out.println(dancer2.getName() + " have finished his enternment");
		else 
			System.out.println(dancer2.getName() + " have to finished his enternment");
		System.out.println("____________________");
	}

}



