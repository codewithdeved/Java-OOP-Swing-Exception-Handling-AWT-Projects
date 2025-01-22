interface Sports {
   void playSports();
}

class Soccer implements Sports {
   public void playSports() {
      System.out.println("Type: Team sport (Soccer)");
      System.out.println("Duration: 90 minutes");
      System.out.println("Equipment: Soccer ball, goalposts");
      System.out.println("Players: 11 players per team");
      System.out.println("Scoring: 1 goal per score");
   }
}

class Player {

   String playerName;
   
   void playing() {
   
      System.out.println(playerName + " is actively engaging in Soccer game play.");
      System.out.println(playerName + " has a good time management ability in Soccer game play.");
      System.out.println(playerName + " has created a goal strategy in his team.");
      System.out.println(playerName + " often get nervous for his tomorrow's match.");
   
   }
}

public class SportsSoccer {

   public static void main(String[] args) {

      Soccer soccer = new Soccer();
      Player player = new Player();

      player.playerName = "Deved";

      soccer.playSports();
      
      System.out.println();
      
      player.playing();

   }

}