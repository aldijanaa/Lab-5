import java.util.Scanner;



public class Main {
    public static void main(String[] args) {


        //task 1
        Team barcelona = new Team("Barcelona");
        Team fenerbahce = new Team("Fenerbahce");
        System.out.println("Team is: " + barcelona.getName());
        System.out.println("Team is: " + fenerbahce.getName());


        //task 2
        Player edin = new Player("Edin");
        System.out.println("playeer " + edin);

        Player pekka = new Player("Pekka", 39);
        System.out.println("player " + pekka);

        //task 3
        barcelona.addPlayer(edin);   //calling the method with the object in it (object edin)
        fenerbahce.addPlayer(edin);
        barcelona.addPlayer(new Player("Mikael", 1)); //creating new object while calling the method

        barcelona.printPlayers();

        //task 4
        System.out.println("number of players " + barcelona.size());


        //task 5
        System.out.println("number of goals is " + barcelona.goals());

    }
}