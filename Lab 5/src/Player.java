public class Player {
    private String playerName;
    private  int numberOfGoals;

    //constructor 1
    public Player(String playerName){
        this.playerName = playerName;

    }

    //constructor 2
    public Player(String playerName, int numberOfGoals){
        this.playerName = playerName;
        this.numberOfGoals = numberOfGoals;
    }

    public String getName(){
        return this.playerName;
    }

    public int getGoals(){
        return this.numberOfGoals;
    }

    public String toString(){
        return this.playerName;
    }

}
