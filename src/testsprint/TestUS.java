package testsprint;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import metier.Academy;
import metier.Battle;
import metier.Dancer;
import metier.Robot;
import metier.Team;
import metier.TennisPlayer;
import metier.Tournament;


public class TestUS {

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
		
		
		System.out.println("******************Test SPRINT 3 ********************");
		System.out.println();
		System.out.println("********Test 1********");
		TennisPlayer tennisPlayer3 = new TennisPlayer("Nicole", "Pearson", "academyDauphine", 24, "Nicky", "Tennis", 5000);
		TennisPlayer tennisPlayer4 = new TennisPlayer("Thomas", "Catton","academyDauphine", 24, "Tom", "Tennis", 4500);
		System.out.println("Avant la rencontre");
		System.out.println(tennisPlayer3.getName() + " a " + tennisPlayer3.getPoints() + " points");
		System.out.println(tennisPlayer4.getName() + " a " + tennisPlayer4.getPoints() + " points");
		System.out.println("Apres la rencontre");		
		System.out.println("Nicole a gagn?? et a desormais " + tennisPlayer3.WinOver(tennisPlayer4) + " points");
		System.out.println("Thomas a perdu et a desormais " + tennisPlayer4.getPoints() + " points");
		System.out.println("____________________");
		System.out.println();
		
		
		System.out.println("********Test 2********");
		Date aujourdhui, newdate;
		DateFormat formatter;
		Locale locale = Locale.getDefault();
		formatter = new SimpleDateFormat("dd-MM-yyyy");
		aujourdhui = Calendar.getInstance().getTime();
		Academy academyDauphine = new Academy(16, "AcademyDauphine", "France", "Paris");
		Team BetSat = new Team("BetSat", academyDauphine);
		Team baDo = new Team ("BaDo", academyDauphine);
		Team DauDau = new Team ("DauDau", academyDauphine);
		Battle battleDauphine = new Battle (aujourdhui, "Dauphine", BetSat, baDo);
				
		Dancer dancer1 = new Dancer("Thomas", "Catton", "academyDauphine", 24,"Dance", "Tom");
		Dancer dancer6 = new Dancer("Nicole", "Pearson", "academyDauphine", 24, "Dance", "Nicky");
		Dancer dancer3 = new Dancer("David", "Rudio", "academyDauphine", 28, "Dance", "Dav");
		Dancer dancer4 = new Dancer("Sophie", "Lopez", "academyDauphine", 23, "Dance", "Lop");
		Dancer dancer5 = new Dancer("David", "Rudio", "academyDauphine", 23, "Dance", "Dav");
		Dancer dancer21 = new Dancer("Aurore", "Catton", "academyDauphine", 24,"Dance", "AU");
		Dancer dancer22 = new Dancer("Marie", "Pearson", "academyDauphine", 24, "Dance", "Rie");
		Dancer dancer23 = new Dancer("Lucie", "Rudio", "academyDauphine", 28, "Dance", "Lux");
		Dancer dancer24 = new Dancer("Rebecca", "Lopez", "academyDauphine", 23, "Dance", "Rev");
		Dancer dancer25 = new Dancer("Jon", "Rudio", "academyDauphine", 23, "Dance", "Jon");
		ArrayList<Dancer> dancers = new ArrayList<Dancer>();
		ArrayList<Dancer> dancersteam2 = new ArrayList<Dancer>();
		ArrayList<Dancer> dancersteam3 = new ArrayList<Dancer>();
		
		dancers.add(dancer1);
		dancers.add(dancer2);
		dancers.add(dancer4);
		dancers.add(dancer21);
		dancers.add(dancer22);
		dancers.add(dancer5);
		dancersteam2.add(dancer21);
		dancersteam2.add(dancer22);
		dancersteam2.add(dancer23);
		dancersteam2.add(dancer24);
		dancersteam2.add(dancer25);
		dancersteam2.add(dancer21);
		dancersteam2.add(dancer22);
		dancersteam2.add(dancer21);
		dancersteam2.add(dancer22);
		dancersteam2.add(dancer21);
		dancersteam2.add(dancer22);
		BetSat.setDancers(dancers);
		baDo.setDancers(dancersteam2);
		
		System.out.println("The team  " + BetSat.getName() + " have " + BetSat.getDancers().size() + " members");
		System.out.println("The team " + baDo.getName() + " have " + baDo.getDancers().size() + " members");
		battleDauphine.CheckBattle(baDo, BetSat);
		System.out.println("____________________");
		System.out.println();
		System.out.println("********Test 3********");
		dancersteam2.remove(dancer22);
		baDo.setDancers(dancersteam2);
		System.out.println("The team " + BetSat.getName() + " have " + BetSat.getDancers().size() + " members");
		System.out.println("The team " + baDo.getName() + " have " + baDo.getDancers().size() + " members");
		battleDauphine.CheckBattle(baDo, BetSat);
	
		System.out.println("____________________");
		System.out.println();
		System.out.println("********Test 4********");
		dancers.add(dancer22);
		dancers.add(dancer22);
		baDo.setDancers(dancersteam2);
		System.out.println("The team " + BetSat.getName() + " have " + BetSat.getDancers().size() + " members");
		System.out.println("The team " + baDo.getName() + " have " + baDo.getDancers().size() + " members");
		battleDauphine.CheckBattle(baDo, BetSat);
		System.out.println("The battle can play");

		
		System.out.println("____________________");
		System.out.println();
		
		Robot r = Robot.getInstance();
		r.loadPlayer(tennisPlayer1);
		r.present();
		
		//Robot r2;
		//r2.present();
	}

}



