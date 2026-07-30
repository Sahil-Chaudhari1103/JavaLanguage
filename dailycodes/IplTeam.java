import java.util.*;

class Player {

    String playerName;
    String playerRole;
    static String playerTeam;

    int totalMatches;
    int playerRuns;
    int playerWickets;

    double playerAverage;
    double playerEconomy;

    static {

        playerTeam = "Mumbai Indians";
    }

    {

        System.out.println("New Player :");
    }

    Player(String name, String role, int matches, int runs) {

        this.playerName = name;
        this.playerRole = role;
        this.totalMatches = matches;
        this.playerRuns = runs;
        this.playerAverage = (double) (runs / matches);
    }

    Player(String name, String role, int matches, int wickets, int runsConceded, double oversBowled) {

        this.playerName = name;
        this.playerRole = role;
        this.totalMatches = matches;
        this.playerWickets = wickets;
        this.playerEconomy = (double) (runsConceded / oversBowled);
    }

    Player(String name, String role, int matches, int runs, int wickets, int runsConceded, double oversBowled) {

        this.playerName = name;
        this.playerRole = role;
        this.totalMatches = matches;
        this.playerRuns = runs;
        this.playerAverage = (double) (runs / matches);
        this.playerWickets = wickets;
        this.playerEconomy = (double) (runsConceded / oversBowled);
    }

    void playerDetails() {

        if (playerRole.equals("Batsman")) {
            System.out.println("Player Team Name : " + playerTeam);
            System.out.println("Player Name : " + playerName);
            System.out.println("Player Role : " + playerRole);
            System.out.println("Total Matches : " + totalMatches);
            System.out.println("Total Runs : " + playerRuns);
            System.out.println("Batting Average : " + playerAverage);

        } else if (playerRole.equals("Bowler")) {
            System.out.println("Player Team Name: " + playerTeam);
            System.out.println("Player Name : " + playerName);
            System.out.println("Player Role : " + playerRole);
            System.out.println("Total Matches : " + totalMatches);
            System.out.println("Total Wickets : " + playerWickets);
            System.out.println("Bowling Economy : " + playerEconomy);

        } else if (playerRole.equals("AllRounder")) {
            System.out.println("Player Team Name: " + playerTeam);
            System.out.println("Player Name : " + playerName);
            System.out.println("Player Role : " + playerRole);
            System.out.println("Total Matches : " + totalMatches);
            System.out.println("Total Runs : " + playerRuns);
            System.out.println("Batting Average : " + playerAverage);
            System.out.println("Total Wickets : " + playerWickets);
            System.out.println("Bowling Economy : " + playerEconomy);
        }
    }
}

class IplTeam {

    int totalPlayers;
    int tableRank;
    static int trophies;

    static String franchiseName;
    static String teamOwner;
    static String teamCaptain;

    static {

        franchiseName = "Mumbai Indians";
        teamOwner = "Reliance Industries";
        teamCaptain = "Rohit Sharma";
        trophies = 5;
    }

    {

        System.out.println("Creating team :");
    }

    IplTeam(int totalPlayers, int tableRank) {

        this.totalPlayers = totalPlayers;
        this.tableRank = tableRank;
    }

    void TeamDetails() {

        System.out.println("Franchise Name : " + franchiseName);
        System.out.println("Team Owner : " + teamOwner);
        System.out.println("Team Captain : " + teamCaptain);
        System.out.println("Trophies Won : " + trophies);
        System.out.println("Total Players : " + totalPlayers);
        System.out.println("Table Rank : " + tableRank);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total squad players in Mumbai Indians team :");
        int squad = sc.nextInt();

        System.out.println("Enter Current Rank in Points table :");
        int rank = sc.nextInt();
        sc.nextLine();

        IplTeam obj = new IplTeam(squad, rank);
        obj.TeamDetails();

        System.out.println("-------------------********************---------------------");

        System.out.println("Enter player name :");
        String name = sc.nextLine();

        System.out.println("Select option for player role : \n" +
                "1 : Batsman \n" +
                "2 : Bowler \n" +
                "3 : AllRounder \n");
        int option = sc.nextInt();

        String role = "";

        do {
            if (option == 1) {
                role = "Batsman";
                break;
            } else if (option == 2) {
                role = "Bowler";
                break;
            } else if (option == 3) {
                role = "AllRounder";
                break;
            } else {
                System.out.println("Incorrect option please enter correct role .");
                System.out.println("Select option for player role : \n" +
                        "1 : Batsman \n" +
                        "2 : Bowler \n" +
                        "3 : AllRounder \n");
                option = sc.nextInt();
            }
        } while (option != 1 && option != 2 && option != 3);

        if (role.equals("Batsman")) {
            System.out.println("Enter player total mathces played :");
            int matches = sc.nextInt();
            System.out.println("Enter player total runs :");
            int runs = sc.nextInt();
            Player obj1 = new Player(name, role, matches, runs);
            obj1.playerDetails();

        } else if (role.equals("Bowler")) {
            System.out.println("Enter player total mathces played :");
            int matches = sc.nextInt();
            System.out.println("Enter player total wickets :");
            int wickets = sc.nextInt();
            System.out.println("Enter player total runs conceded in this season :");
            int runsConceded = sc.nextInt();
            System.out.println("Enter player total overs bowled in this season :");
            double oversBowled = sc.nextDouble();
            Player obj1 = new Player(name, role, matches, wickets, runsConceded, oversBowled);
            obj1.playerDetails();

        } else if (role.equals("AllRounder")) {
            System.out.println("Enter player total mathces played :");
            int matches = sc.nextInt();
            System.out.println("Enter player total runs :");
            int runs = sc.nextInt();
            System.out.println("Enter player total wickets :");
            int wickets = sc.nextInt();
            System.out.println("Enter player total runs conceded in this season :");
            int runsConceded = sc.nextInt();
            System.out.println("Enter player total overs bowled in this season :");
            double oversBowled = sc.nextDouble();
            Player obj1 = new Player(name, role, matches, runs, wickets, runsConceded, oversBowled);
            obj1.playerDetails();
        }
    }

}
