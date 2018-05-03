import java.util.Arrays;
import java.util.List;
// w ww  .j a va2 s.c  o m
public class StreamAllMatch {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    boolean o = numbers.stream()
                     .anyMatch(n-> n % 2 ==0);

    System.out.println(o);
  }
}