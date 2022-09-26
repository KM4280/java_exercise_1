import java.util.Scanner;

public class Fibonacci implements Command{
    public int doFibo(int input2){
        int nbr1=0, nbr2=1, nbr3=0, i;
        if("0".equals(input2)){
            return(nbr1);
        }
        if("1".equals(input2)){
            return(nbr2);
        } else {
            for(i=2; i<(input2+1); i++){    
                nbr3 = nbr1 + nbr2;       
                nbr1 = nbr2;    
                nbr2 = nbr3;   
            }    
            return(nbr3);
        }
    }
    public String name(){
        return "fibo";
    }
    public boolean run(Scanner cmd){
        System.out.print("valeur de la suite de Fibonacci: ");
        int input2 = cmd.nextInt();
        cmd.nextLine();
        System.out.println(this.doFibo(input2));
        return true;
    }
}
