import java.nio.file.Paths;
import java.util.Scanner;
import java.io.IOException;
import java.util.*;

public class Frequencies implements Command{
    public String doFreq(String filename) throws IOException {
        var filepath = Paths.get(filename);
        var text = java.nio.file.Files.readString(filepath);
        text = text.replaceAll("[^a-zA-Z ]"," ");
        text = text.toLowerCase();
        String[] a = text.split(" ");
        var hm = new HashMap<String, Integer>();
        for (int i=0; i<a.length; i++){
            if (!hm.containsKey(a[i])){
                hm.put(a[i], 0);
            } else {
                hm.put(a[i], hm.get(a[i]) + 1);
            }
        }
        String cle1 = ""; int valeur1 = 0; String cle2 = ""; int valeur2 = 0; String cle3 = ""; int valeur3 = 0;
        String baseCle = ""; int baseValeur = 0;
        for (var entry : hm.entrySet()) {
            baseValeur = entry.getValue();
            baseCle = entry.getKey();
            if (!baseCle.equals("")) {
                if (baseValeur > valeur1) {
                    cle1 = baseCle;
                    valeur1 = baseValeur;
                } else if (baseValeur > valeur2) {
                    cle2 = baseCle;
                    valeur2 = baseValeur;
                } else if (baseValeur > valeur3) {
                    cle3 = baseCle;
                    valeur3 = baseValeur;
                }
            }
        }
        return cle1 + " " + cle2 + " " + cle3;
    }
    public String name(){
        return "freq";
    }
    public boolean run(Scanner cmd){
        System.out.print("chemin du fichier: ");
        String filename = cmd.nextLine();
        try {
            System.out.println(this.doFreq(filename));
        } catch (IOException error) {
            System.out.print("Unreadable file: " + error.toString());
        }
        return true;
    }
}
