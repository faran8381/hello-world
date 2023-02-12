import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date is: "+dtf.format(now));
    }
}

