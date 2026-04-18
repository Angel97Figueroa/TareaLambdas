import java.util.*;
import java.util.stream.Collectors;

public class UtileriaCadenas {
    public static ArrayList<String> filtroSelectivo(char letraProhibida, int longitudMin, ArrayList<String> wordsList){
        //Si el ArrayList es nulo, se termina el metodo regresando un ArrayList vacio
        if(wordsList==null){
            return new ArrayList<>();
        }
        wordsList.removeIf(cadena->cadena==null || cadena.toLowerCase().startsWith(String.valueOf(letraProhibida).toLowerCase()) || cadena.length()<longitudMin);
        return wordsList;
    }

    public static ArrayList<String> conversorDeMayusculas(ArrayList<String> wordsList){
        //Si el ArrayList es nulo, se termina el metodo regresando un ArrayList vacio
        if(wordsList==null){
            return new ArrayList<>();
        }

        return wordsList.stream().filter(cadena->cadena!=null).map(cadena->cadena.toUpperCase()).collect(Collectors.toCollection(ArrayList<String>::new));
    }

    public static HashMap<String, Integer> mapaDeLongitudes(ArrayList<String> wordsList){
        //Si el HashMap es nulo, se termina el metodo regresando un HashMap vacio
        if(wordsList==null){
            return new HashMap<>();
        }

        return wordsList.stream().filter(s->s!=null).collect(Collectors.toMap(w->w,w->w.length(),(viejo, nuevo)->viejo,HashMap::new));
    }

    public static HashMap<String, Integer> contadorDeFrecuencias(ArrayList<String> wordsList){
        //Si el HashMap es nulo, se termina el metodo regresando un HashMap vacio
        if(wordsList==null){
            return new HashMap<>();
        }

        HashMap<String, Integer> mapaDeFrecuencias=new HashMap<>();
        wordsList.stream().filter(cadena->cadena!=null).forEach(w->mapaDeFrecuencias.merge(w,1,(viejo, nuevo)->viejo+nuevo));
        return mapaDeFrecuencias;
    }

    public static ArrayList<String> clasificadorDePalabras(int frecuenciaMin, HashMap<String, Integer> mapaDeFrecuencias){
        //Si el HashMap es nulo, se termina el metodo regresando un ArrayList vacio
        if(mapaDeFrecuencias==null){
            return new ArrayList<>();
        }

        ArrayList<String> palabrasClasificadas=mapaDeFrecuencias.entrySet().stream().filter(elemento->elemento.getValue()!=null && elemento.getKey()!=null).filter(elemento->elemento.getValue()>frecuenciaMin).map(e->e.getKey()).collect(Collectors.toCollection(ArrayList<String>::new));
        return palabrasClasificadas;
    }

    public static HashSet<String> dedupliacionDePalabras(String frase, int minimoDeLetras){
        //Si la frase es nula, se termina el metodo regresando un HashSet
        if(frase==null){
            return new HashSet<>();
        }
        return Arrays.stream(frase.split("\\W+")).filter(palabra->palabra!=null).filter(palabra->!palabra.isEmpty()).map(cadena->cadena.toLowerCase()).filter(palabra->palabra.length()>=minimoDeLetras).collect(Collectors.toCollection(HashSet<String>::new));
    }


}
