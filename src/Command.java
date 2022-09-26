import java.util.Scanner;

public interface Command {
    
    boolean run(Scanner cmd);

    String name();

}
