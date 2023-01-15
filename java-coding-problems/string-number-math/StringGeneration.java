import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringGeneration {
    
    public static void main(String[] args) {
        
        String hello = "Hello";

        System.out.println(
                hello.repeat(5)
        );

        System.out.println(
                String.join(
                        "", Collections.nCopies(5, hello)
                )
        );

        System.out.println(
                Stream.generate(() -> hello)
                        .limit(5)
                        .collect(Collectors.joining())
        );
    }

}
