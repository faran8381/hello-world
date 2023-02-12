import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date is: " + dtf.format(now));
        //display the current amount of free memory to the user
        Runtime gfg = Runtime.getRuntime();
        long memory1, memory2;
        Integer integer[] = new Integer[1000];

        // checking the total memory
        System.out.println("Total memory is: "
                + gfg.totalMemory());

        // checking free memory
        memory1 = gfg.freeMemory();
        System.out.println("Initial free memory: "
                + memory1);

        // calling the garbage collector on demand
        gfg.gc();

        memory1 = gfg.freeMemory();

        System.out.println("Free memory after garbage "
                + "collection: " + memory1);

        // allocating integers
        for (int i = 0; i < 1000; i++)
            integer[i] = new Integer(i);

        memory2 = gfg.freeMemory();
        System.out.println("Free memory after allocation: "
                + memory2);

        System.out.println("Memory used by allocation: " +
                (memory1 - memory2));

        // discard integers
        for (int i = 0; i < 1000; i++)
            integer[i] = null;

        gfg.gc();

        memory2 = gfg.freeMemory();
        System.out.println("Free memory after  "
                + "collecting discarded Integers: " + memory2);
    }
}