import java.util.*;
class Streamcount {
    public static void main(String[] args)
    {
        List<String> list=Arrays.asList("a","a","c","d","e");
        long count=list.stream().distinct().count();
    
        System.out.println(count);
        list.stream().distinct().forEach(System.out::println);
    }
}
 