import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
//w ww.ja  v  a  2s.  co m
public class StreamConcat {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
    
    Stream<Integer> s = Stream.concat(numbers.stream(),
        numbers1.stream()); 
                     
        //System.out.println(s);
    System.out.println(s.count());
  }
}