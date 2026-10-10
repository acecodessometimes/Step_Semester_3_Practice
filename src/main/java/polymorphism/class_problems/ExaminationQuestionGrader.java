package polymorphism.class_problems;

public class ExaminationQuestionGrader {
    abstract static class Question {
        final String type;
        final String correctAnswer;
        final String studentAnswer;
        final double points;
        Question(String type, String correctAnswer, String studentAnswer, double points) {
            this.type = type;
            this.correctAnswer = correctAnswer;
            this.studentAnswer = studentAnswer;
            this.points = points;
        }
        abstract double score();
    }

    static class ExactQuestion extends Question {
        ExactQuestion(String type, String correct, String student, double points) { super(type, correct, student, points); }
        double score() { return correctAnswer.equals(studentAnswer) ? points : 0; }
    }

    static class EssayQuestion extends Question {
        EssayQuestion(String correct, String student, double points) { super("ESSAY", correct, student, points); }
        double score() {
            int matches = 0;
            String lowerAnswer = studentAnswer.toLowerCase();
            for (String keyword : correctAnswer.split(",")) {
                if (lowerAnswer.contains(keyword.trim().toLowerCase())) {
                    matches++;
                }
            }
            if (matches >= 2) {
                return points * 0.75;
            }
            if (matches == 1) {
                return points * 0.50;
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        Question[] questions = {
            new ExactQuestion("MCQ", "Paris", "Paris", 10),
            new ExactQuestion("TF", "False", "True", 5),
            new EssayQuestion("Inheritance, Polymorphism, Encapsulation", "Polymorphism is one.", 20),
            new EssayQuestion("Abstraction, Composition", "I talked about abstraction.", 15)
        };
        double total = 0;
        for (Question question : questions) {
            double score = question.score();
            total += score;
            System.out.printf("%s: %.2f%n", question.type, score);
        }
        System.out.printf("Total Score: %.2f%n", total);
    }
}
