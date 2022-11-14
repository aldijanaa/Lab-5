import java.util.ArrayList;

public class Team {
    private String name;

    ArrayList<Player> players = new ArrayList<Player>();

    //constructor
    public Team(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    //add player
    public void addPlayer(Player edin){
        this.players.add(edin);
    }

    public void printPlayers(){
        System.out.println(players);
    }

    public int setMaxSize(int maxSize){
        maxSize = 16;
        return maxSize;
    }

    public int size(){
        return players.size();

    }

    public int goals(){
        int totalGoals = 0;

        for(Player players : this.players){
            totalGoals = totalGoals + players.getGoals();
        }
        return totalGoals;


    }

}
