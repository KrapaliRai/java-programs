public class Overriding {
    public static void main(String[] agrs){
        int newScore= calculateScore("krapali",400);
        System.out.println("New score : " + newScore);
        calculateScore(786);
        //calculateScore("sfdf",12313);
        calculateScore();
    }

    private static int calculateScore(String playerName, int score) {
        System.out.println("Player: " + playerName +" Score: "+ score);
        return score* 1075345;
    }
    private static int calculateScore( int score) {
        System.out.println(" Score: "+ score);
        return score* 1075345;
    }

    private static int calculateScore() {
        System.out.println(" No Score ");
        return 0;
    }


}
