import java.util.Scanner;

public class Quitting implements Command{
    public void doQuit(){
        System.exit(0);
        return;
    }
    public String name(){
        return "quit";
    }
    public boolean run(Scanner cmd){
        cmd.close();
        this.doQuit();
        return true;
    }
}
