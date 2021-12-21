import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        //Объявление
        Variant variant1 = new Variant("4", "2", "1");
        Variant variant2 = new Variant("1", "0", "-1");
        Variant variant3 = new Variant("5", "3", "4");
        Question question1 = new Question("2+2", variant1, "1");
        Question question2 = new Question("2-2", variant2, "2");
        Question question3 = new Question("2*2", variant3, "3");
        Scanner scanner = new Scanner(System.in);
        String[] comparisons = new String[3];
        int count = 0;
        String input;

        //Лист с объектами (вопрос, варианты, правильный ответ)
        List<Question> questionList = new ArrayList<>();
        questionList.add(question1);
        questionList.add(question2);
        questionList.add(question3);

        //Вывод вопросов и сравнение ответов
        for (int i = 0; i < questionList.size(); i++) {
            System.out.println("Вопрос №" + (i + 1));
            System.out.println(questionList.get(i).getQuestion()); // Вопросы
            System.out.println("Варианты ответов: ");
            switch (i+1) { // Варианты
                case 1 -> System.out.println(variant1.getVariants());
                case 2 -> System.out.println(variant2.getVariants());
                case 3 -> System.out.println(variant3.getVariants());
            }
                input = scanner.nextLine(); // Ввод
                if (input.equals(questionList.get(i).getCorrectAnswer())) { // Сравнение
                    comparisons[i] = "Вопрос №" + (i + 1) + " - верно";
                    count++; // Счётчик
                } else {
                    comparisons[i] = "Вопрос №" + (i + 1) + " - неверно";
                }
                System.out.println("__________________");
        }

        //Вывод результатов
        for (int i = 0; i < questionList.size(); i++)
            System.out.println(comparisons[i]);
        System.out.println("Количество правильных ответов: " + count + " из " + questionList.size());
    }
}
