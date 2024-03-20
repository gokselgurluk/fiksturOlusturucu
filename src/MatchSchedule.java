import java.util.ArrayList;
import java.util.*;

public class MatchSchedule {
    ArrayList<String> homeTeam= new ArrayList<>();
    ArrayList<String> awayTeam= new ArrayList<>();
    ArrayList<String> teams = new ArrayList<>();

   /* public MatchSchedule(ArrayList<String> teams) {
       this.teams = teams;
    }*/

    public void teamInput(){
        System.out.println("Takım Ekleyin Çıkmak için 'Q' tuşuna basınız ");
        boolean isInput =true;
        int teamCount =0;
        while(isInput){
            String team = Main.input.nextLine();
            if(!team.equalsIgnoreCase("q")) {
                teams.add(team);
                teamCount++;
            }else{
                isInput=false;
            }
            System.out.println("Eklene Takım Sayisi: "+teamCount);
        }
        for(String i : teams) {
            System.out.println("Eklenen Takımlar: "+i);
        }


        if(teams.size() % 2 != 0){
            teams.add("Bay");
        }
        Collections.shuffle(teams);
        fiks();
    }
    public void fiks(){
        int matchCount = (teams.size() - 1) * 2;
        for(int i = 0; i < matchCount; i++ ){
        System.out.println((i+1)+". Gün: ");
        for(int j =0 ; j < teams.size()/2 ; j++ ) {
            homeTeam.add(teams.get(j)+" Vs "+teams.get(teams.size()-1-j));
            awayTeam.add(teams.get(teams.size()-1-j)+" Vs "+teams.get(j));
            String value = teams.remove(teams.size()-1);
            teams.add(1,value);
            if(matchCount /2>i) {
                System.out.println("Karşılaşma: " + homeTeam.get(j));

            }else {
                System.out.println("Rövanş Karşılaşma: " + awayTeam.get(j));
            }
        }
        homeTeam.clear();
        awayTeam.clear();
        //Collections.rotate(teams,1);
    }
    }

}
