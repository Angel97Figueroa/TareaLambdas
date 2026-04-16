import java.util.ArrayList;
import java.util.Collections;

public class Cadenas {
    public static ArrayList<String> filtroSelectvo(char letraProhibida, int longitudMin){
        ArrayList<String> wordsList=new ArrayList<>();
        Collections.addAll(wordsList, "Diego","Pablo","Gael","Angel","Manuel", "Angel Shiny");
        wordsList.removeIf(cadena->cadena.toLowerCase().startsWith(String.valueOf(letraProhibida).toLowerCase()) || cadena.length()<longitudMin);
        return wordsList;
    }
}
