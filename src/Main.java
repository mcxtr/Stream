import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.of(10,50,30,100).map(x -> x/10).forEach(System.out::println);


    }
}