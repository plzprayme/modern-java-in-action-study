import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Apple> c1 = Apple::new;
        Apple lambda = c1.get();
        System.out.println(lambda.getWeight());

        Function<Integer, Apple> c2 = Apple::new;
        Apple lambda2 = c2.apply(5);
        System.out.println(lambda2.getWeight());
    }
}
