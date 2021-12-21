import java.util.*;

public class Sort {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        final int MAX_VALUE = 20_000;
        Random random = new Random();
        long before,after;
        int temp;

        //заполняем
        for (int i = 0; i < MAX_VALUE; i++) {
            list1.add(random.nextInt(100));
            list2.add(random.nextInt(100));
        }

        //сортируем (быстрая)
        before = System.currentTimeMillis();
        Collections.sort(list1);
        after = System.currentTimeMillis();
        System.out.println((after-before)/1000f);
        System.out.println(list1);

        //сортируем (пузырьком)
        before = System.currentTimeMillis();
        for (int i = list2.size()-1; i > 0; i--)
            for (int j = 0; j < i; j++){
                if (list2.get(j)> list2.get(j+1)){
                    temp = list2.get(j);
                    list2.set(j, list2.get(j + 1));
                    list2.set(j + 1, temp);
                }
            }
        after = System.currentTimeMillis();
        System.out.println((after-before)/1000f);
        System.out.println(list2);

    }
}
