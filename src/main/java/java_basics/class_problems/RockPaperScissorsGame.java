import java.util.Random;

public class RockPaperScissorsGame {

    static String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) {
            return "Draw";
        }

        boolean playerWins =
                (playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors")) ||
                (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock")) ||
                (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper"));

        return playerWins ? "Player Wins" : "Computer Wins";
    }

    public static void main(String[] args) {
        String[] moves = {"Rock", "Paper", "Scissors"};
        String[] playerMoves = {"Rock", "Paper", "Scissors", "Rock", "Paper"}; // predefined for demo
        int n = playerMoves.length;

        String[] roundPlayerMove = new String[n];
        String[] roundComputerMove = new String[n];
        String[] roundResult = new String[n];

        Random random = new Random();
        int wins = 0, losses = 0, draws = 0;

        for (int i = 0; i < n; i++) {
            String playerMove = playerMoves[i];
            String computerMove = moves[random.nextInt(3)];
            String result = playRound(playerMove, computerMove);

            roundPlayerMove[i] = playerMove;
            roundComputerMove[i] = computerMove;
            roundResult[i] = result;

            if (result.equals("Player Wins")) wins++;
            else if (result.equals("Computer Wins")) losses++;
            else draws++;
        }

        System.out.println("Round | Player Move | Computer Move | Result");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + " | " + roundPlayerMove[i] + " | " + roundComputerMove[i] + " | " + roundResult[i]);
        }

        double winPercentage = ((double) wins / n) * 100;
        System.out.println("\nFinal Summary (after " + n + " rounds)");
        System.out.printf("Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%%n", wins, losses, draws, winPercentage);
    }
}
