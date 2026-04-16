import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Cadenas {
    public static ArrayList<String> filtroSelectvo(char letraProhibida, int longitudMin){
        ArrayList<String> wordsList=new ArrayList<>();
        Collections.addAll(wordsList, "Diego","Pablo","Gael","Angel","Manuel", "Angel Shiny");
        System.out.println("Cadenas originales\n"+wordsList);
        wordsList.removeIf(cadena->cadena.toLowerCase().startsWith(String.valueOf(letraProhibida).toLowerCase()) || cadena.length()<longitudMin);
        return wordsList;
    }

    public static ArrayList<String> conversorDeMayusculas(){
        ArrayList<String> wordsList=new ArrayList<>();
        Collections.addAll(wordsList, "Diego","Pablo","Gael","Angel","Manuel", "Angel Shiny");
        System.out.println("Cadenas sin modificar\n"+wordsList);
        return wordsList.stream().map(cadena->cadena.toUpperCase()).collect(Collectors.toCollection(ArrayList<String>::new));
    }
}
