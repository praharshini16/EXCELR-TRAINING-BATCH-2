public class PS003 {

    String name;
    int wickets;
    int matches;
    int balls_bowled;
    int runs_conceded;

    
    public PS003() {
        this.name = "";
        this.wickets = 0;
        this.matches = 0;
        this.balls_bowled = 0;
        this.runs_conceded = 0;
    }

    
    public PS003(String name, int wickets, int matches, int balls_bowled, int runs_conceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.balls_bowled = balls_bowled;
        this.runs_conceded = runs_conceded;
    }

    
    public void computeBowlingAverage() {
        if (wickets < 0 || matches < 0 || balls_bowled < 0 || runs_conceded < 0) {
            System.out.println("Error");
            return;
        }
        if ((runs_conceded > 0 || balls_bowled > 0) && matches == 0) {
            System.out.println("Error");
            return;
        }
        if (wickets == 0) {
            System.out.println("Error");
            return;
        }
        double bowling_avg = (double) runs_conceded / wickets;
        System.out.println("Name: " + name);
        System.out.println("bowling_avg=" + bowling_avg);
    }

    
    public void showStatistics() {
        if (wickets < 0 || matches < 0 || balls_bowled < 0 || runs_conceded < 0) {
            System.out.println("Error");
            return;
        }
        if ((runs_conceded > 0 || balls_bowled > 0) && matches == 0) {
            System.out.println("Error");
            return;
        }
        System.out.println("Name=" + name);
        System.out.println("wickets=" + wickets);
        System.out.println("matches=" + matches);
        System.out.println("balls_bowled=" + balls_bowled);
        System.out.println("runs_conceded=" + runs_conceded);
    }

    
    public void computeStrikeRate() {
        if (wickets < 0 || matches < 0 || balls_bowled < 0 || runs_conceded < 0) {
            System.out.println("Error");
            return;
        }
        if ((runs_conceded > 0 || balls_bowled > 0) && matches == 0) {
            System.out.println("Error");
            return;
        }
        if (balls_bowled == 0) {
            System.out.println("Error");
            return;
        }
        double strike_rate = (double) runs_conceded / balls_bowled;
        System.out.println("Name: " + name);
        System.out.println("Strike_rate=" + strike_rate);
    }
    public static void main(String[] args) {
      
        PS003 bowler = new PS003("Sachin", 10, 5, 750, 463);

       
        bowler.showStatistics();
        bowler.computeBowlingAverage();
        bowler.computeStrikeRate();
    }
}