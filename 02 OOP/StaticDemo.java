import java.util.ArrayList;
import java.util.List;

class Player {
    private int id;
    private String name;
    private int indiviudalGoals;

    private static int teamScore;

    public Player(int id, String name, int indiviudalGoals) {
        this.id = id;
        this.name = name;
        this.indiviudalGoals = indiviudalGoals;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndiviudalGoals() {
        return indiviudalGoals;
    }

    public void madeGoal() {
        ++this.indiviudalGoals;
    }

    public  int getTeamScore() {
        return teamScore;
    }

    public void setTeamScore(int teamScore) {
        Player.teamScore = teamScore;
    }

    public void displayIndividualGoals(){
        System.out.println(this.name + " Goals : "+ this.indiviudalGoals);
    }
    public static void displayTeamScore(){
        System.out.println("Team Score is :" + Player.teamScore);
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", indiviudalGoals=" + indiviudalGoals +
                ", Team Score=" + teamScore +
                '}';
    }
}
public class StaticDemo {
    public static void main(String[] args) {
        Player p1 = new Player(1, "A", 0);
        Player p2 = new Player(2, "B", 0);
        Player p3 = new Player(3, "C", 0);
        List<Player> team = new ArrayList<>();
        team.add(p1);
        team.add(p2);
        team.add(p3);
        System.out.println("Game Starts - Team Score ");
        Player.displayTeamScore();
        team.forEach( player -> {
            System.out.println(player.toString());
        });

        System.out.println("\nHurray P1 made a goal");
        p1.madeGoal();
        p1.setTeamScore(p1.getTeamScore() +  1);
        Player.displayTeamScore();
        team.forEach( player -> {
            System.out.println(player.toString());
        });

        System.out.println("\nHurray P2 made a goal");
        p2.madeGoal();
        p2.setTeamScore(p1.getTeamScore() +  1);
        Player.displayTeamScore();
        team.forEach( player -> {
            System.out.println(player.toString());
        });

        System.out.println("\nHurray P1 made a goal");
        p1.madeGoal();
        p1.setTeamScore(p1.getTeamScore() +  1);
        Player.displayTeamScore();
        team.forEach( player -> {
            System.out.println(player.toString());
        });
    }
}
