import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple(5));
        appleList.add(new Apple(6));
        List<Apple> redApples =
                filter(appleList, (Apple apple) -> apple.getWeight() == 5);
        List<Integer> evenNumbers =
                filter(Arrays.asList(1,2,3,4,5,6), (Integer i) -> i % 2 == 0);
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for (T e: list) {
            if(p.test(e)) {
                result.add(e);
            }
        }
        System.out.println(result);

        return result;
    }
}
