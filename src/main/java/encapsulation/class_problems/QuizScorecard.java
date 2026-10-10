package encapsulation.class_problems;

public class QuizScorecard {
    static class Scorecard {
        private final boolean[] results;
        private int answersRecorded;

        Scorecard(int questionCount) {
            results = new boolean[Math.max(0, questionCount)];
        }

        void recordAnswer(boolean correct) {
            if (answersRecorded < results.length) {
                results[answersRecorded++] = correct;
            }
        }

        int getScore() {
            int score = 0;
            for (int index = 0; index < answersRecorded; index++) {
                if (results[index]) {
                    score++;
                }
            }
            return score;
        }
    }

    public static void main(String[] args) {
        Scorecard scorecard = new Scorecard(4);
        scorecard.recordAnswer(true);
        scorecard.recordAnswer(true);
        scorecard.recordAnswer(false);
        scorecard.recordAnswer(true);
        System.out.println(scorecard.getScore());
    }
}
