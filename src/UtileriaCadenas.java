import java.util.*;
import java.util.stream.Collectors;

public class UtileriaCadenas {
    public static ArrayList<String> filtroSelectvo(char letraProhibida, int longitudMin, ArrayList<String> wordsList){
        wordsList.removeIf(cadena->cadena.toLowerCase().startsWith(String.valueOf(letraProhibida).toLowerCase()) || cadena.length()<longitudMin);
        return wordsList;
    }

    public static ArrayList<String> conversorDeMayusculas(ArrayList<String> wordsList){
        return wordsList.stream().map(cadena->cadena.toUpperCase()).collect(Collectors.toCollection(ArrayList<String>::new));
    }

    public static HashMap<String, Integer> mapaDeLongitudes(ArrayList<String> wordsList){
        return wordsList.stream().collect(Collectors.toMap(w->w,w->w.length(),(viejo, nuevo)->viejo,HashMap::new));
    }

    public static HashMap<String, Integer> contadorDeFrecuencias(ArrayList<String> wordsList){
        HashMap<String, Integer> mapaDeFrecuencias=new HashMap<>();
        wordsList.forEach(w->mapaDeFrecuencias.merge(w,1,(viejo, nuevo)->viejo+nuevo));
        return mapaDeFrecuencias;
    }

    public static ArrayList<String> clasificadorDePalabras(int frecuenciaMin, HashMap<String, Integer> mapaDeFrecuencias){
        ArrayList<String> palabrasClasificadas=mapaDeFrecuencias.entrySet().stream().filter(elemento->elemento.getValue()>frecuenciaMin).map(e->e.getKey()).collect(Collectors.toCollection(ArrayList<String>::new));
        return palabrasClasificadas;
    }

    public static HashSet<String> dedupliacionDePalabras(String frase, int minimoDeLetras){
        return Arrays.stream(frase.split(" ")).filter(palabra->palabra.toLowerCase().length()<minimoDeLetras).collect(Collectors.toCollection(HashSet<String>::new));
    }

    public static HashMap<String, Integer> topeDeFrecuencia(HashMap<String, Integer> mapaDeFrecuencias, int limiteDeFrecuencia){
        mapaDeFrecuencias.replaceAll((palabra, frecuencia)->frecuencia>=limiteDeFrecuencia ? limiteDeFrecuencia : frecuencia);
        return mapaDeFrecuencias;
    }

}
