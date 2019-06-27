public class Main {
    public static void main(String[] agrs){
        int newScore= calculateScore("krapali",300);
        System.out.println("New score : " + newScore);

    }

    private static int calculateScore(String playerName, int score) {
        System.out.println("Player: " + playerName +" Score: "+ score);
        return score* 1075345;
    }
}
