import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Cadenas {
    public static ArrayList<String> filtroSelectvo(char letraProhibida, int longitudMin){
        ArrayList<String> wordsList=new ArrayList<>();
        Collections.addAll(wordsList, "Diego","Pablo","Gael","Angel","Manuel", "Angel Shiny");
        System.out.println("Cadenas originales\n"+wordsList); //ArrayList sin modificar
        wordsList.removeIf(cadena->cadena.toLowerCase().startsWith(String.valueOf(letraProhibida).toLowerCase()) || cadena.length()<longitudMin);
        return wordsList;
    }

    public static ArrayList<String> conversorDeMayusculas(){
        ArrayList<String> wordsList=new ArrayList<>();
        Collections.addAll(wordsList, "Diego","Pablo","Gael","Angel","Manuel", "Angel Shiny");
        System.out.println("Cadenas sin modificar\n"+wordsList); //ArrayList sin modificar
        return wordsList.stream().map(cadena->cadena.toUpperCase()).collect(Collectors.toCollection(ArrayList<String>::new));
    }

    public static HashMap<String, Integer> mapaDeLongitudes(){
        ArrayList<String> wordsList=new ArrayList<>();
        Collections.addAll(wordsList, "Diego","Pablo","Gael","Angel","Manuel", "Angel Shiny");
        System.out.println("Cadenas originales\n"+wordsList);
        return wordsList.stream().collect(Collectors.toMap(w->w,w->w.length(),(viejo, nuevo)->viejo,HashMap::new));
    }
}
