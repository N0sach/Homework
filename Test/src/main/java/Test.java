import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        //Объявление
        String[] questions = {"Сколько будет 2+2?", "Формула длины окружности", "Число Пи"};
        String[][] variants = {
                {"четыре", "пять", "один"},
                {"Pi*r^2", "2*Pi*r", "Pi*r"},
                {"3.22", "9.11", "3.14"}
        };
        String[] rightAnswers = {"1", "2", "3"};
        String[] answers = new String[3];
        String[] results = new String[3];
        Scanner sc = new Scanner(System.in);
        int count = 0;

        //Вывод вопросов и сравнение ответов
        for (int i = 0; i <= 2; i++) {
            System.out.println("Вопрос " + (i + 1));
            System.out.println(questions[i]);
            System.out.println("Варианты ответов:");
            for (int j =0 ; j <= 2; j++) {
                System.out.print(j+1 + ". " + variants[i][j] + "   ");
            }
            System.out.println();
            answers[i] = sc.nextLine();
            if (answers[i].equals(rightAnswers[i])) {
                results[i] = "Вопрос " + (i + 1) + " - верно";
                count++;
            } else
                results[i] = "Вопрос " + (i + 1) + " - неверно";
        }

        //Вывод результатов
        for (int i = 0; i <= 2; i++)
            System.out.println(results[i]);
        System.out.println("Количество правильных ответов: " + count + " из " + results.length);
    }
}