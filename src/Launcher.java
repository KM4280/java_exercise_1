import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("Bienvenue");
        var scanner = new Scanner(System.in);
        List<Command> commands = Arrays.asList(new Quitting(), new Fibonacci(), new Frequencies());

        
        while(true){
            String input = scanner.nextLine();
            int r = 0;
            for(int i=0; i<commands.size(); i++){
                if(input.equals(commands.get(i).name())){
                    commands.get(i).run(scanner);
                    r = 1;
                }
            }
            if(r == 0){
                System.out.println("unknown command");
            }
        }
    }
}
