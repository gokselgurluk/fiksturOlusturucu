import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);
    static Random random = new Random();
    public static void main(String[] args) {
        MatchSchedule match = new MatchSchedule();
        match.teamInput();


   /*


        ArrayList<String> tempTeam= new ArrayList<>();

        boolean isInput =true;
        int teamCount =0;
        while(isInput){
            String team =input.nextLine();
            if(!team.equalsIgnoreCase("q")) {
                tempTeam.add(team);
                teamCount++;
            }else{
                isInput=false;
            }
            System.out.println("Eklene Takım Sayisi: "+teamCount);
        }
        for(String i : tempTeam) {
            System.out.println("Eklenen Takımlar: "+i);
        }


        if(tempTeam.size() % 2 != 0){
            tempTeam.add("Bay");
             }
        MatchSchedule teams = new MatchSchedule(tempTeam);
        teams.fiks();*/
        //Collections.shuffle(teams);






    }
}
