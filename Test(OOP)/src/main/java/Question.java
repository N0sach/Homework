public class Question {

    private String question;
    private Variant variant;
    private String correctAnswer;

    public Question(String question, Variant variant, String correctAnswer) {
        this.question = question;
        this.variant = variant;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}

