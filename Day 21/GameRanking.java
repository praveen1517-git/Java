class GameRanking
{
    public static void main(String[] args)
    {
        long score = 1500;
        double time = 12.5;

        System.out.println("ORIGINAL VALUES");
        System.out.println("Score = " + score);
        System.out.println("Time = " + time);
        System.out.println("\nCORRECT TYPE CASTING");

        double dScore = (double) score; 
        double dTime = time;

        System.out.println("After casting score = " + dScore);
        System.out.println("After casting time = " + dTime);

        double rankScoreCorrect = dScore / dTime;

        System.out.println("Correct Rank Score = " + rankScoreCorrect);

        System.out.println("\nWRONG TYPE CASTING");

        int wrongScore = (int) score; 
        int wrongTime = (int) time; 

        System.out.println("After wrong cast score = " + wrongScore);
        System.out.println("After wrong cast time = " + wrongTime);

        int rankScoreWrong = wrongScore / wrongTime;

        System.out.println("Wrong Rank Score = " + rankScoreWrong);
    }
}
