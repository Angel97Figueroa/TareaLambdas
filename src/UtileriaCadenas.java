import java.util.*;
import java.util.stream.Collectors;

public class UtileriaCadenas {
    public static ArrayList<String> filtroSelectivo(char letraProhibida, int longitudMin, ArrayList<String> wordsList){
        //Si el ArrayList es nulo, se termina el metodo regresando un ArrayList vacio
        if(wordsList==null){
            return new ArrayList<>();
        }
        //Se eliminan elementos si son nulos, si inician con la letra prohibida o si son mas cortos que la longitud minima
        wordsList.removeIf(cadena->cadena==null || cadena.toLowerCase().startsWith(String.valueOf(letraProhibida).toLowerCase()) || cadena.length()<longitudMin);
        return wordsList;
    }

    public static ArrayList<String> conversorDeMayusculas(ArrayList<String> wordsList){
        //Si el ArrayList es nulo, se termina el metodo regresando un ArrayList vacio
        if(wordsList==null){
            return new ArrayList<>();
        }

        //Filtra valores nulos, transforma cada cadena a mayusculas y retorna el resultado en un nuevo ArrayList
        return wordsList.stream().filter(cadena->cadena!=null).map(cadena->cadena.toUpperCase()).collect(Collectors.toCollection(ArrayList<String>::new));
    }

    public static HashMap<String, Integer> mapaDeLongitudes(ArrayList<String> wordsList){
        //Si el HashMap es nulo, se termina el metodo regresando un HashMap vacio
        if(wordsList==null){
            return new HashMap<>();
        }

        //Filtra nulos y crea un mapa donde la llave es la palabra y el valor es su longitud, en caso de duplicados mantiene el primero
        return wordsList.stream().filter(s->s!=null).collect(Collectors.toMap(w->w,w->w.length(),(viejo, nuevo)->viejo,HashMap::new));
    }

    public static HashMap<String, Integer> contadorDeFrecuencias(ArrayList<String> wordsList){
        //Si el HashMap es nulo, se termina el metodo regresando un HashMap vacio
        if(wordsList==null){
            return new HashMap<>();
        }

        HashMap<String, Integer> mapaDeFrecuencias=new HashMap<>();
        //Itera la lista filtrando nulos y utiliza merge para incrementar el contador por cada vez que se repite la palabra
        wordsList.stream().filter(cadena->cadena!=null).forEach(w->mapaDeFrecuencias.merge(w,1,(viejo, nuevo)->viejo+nuevo));
        return mapaDeFrecuencias;
    }

    public static ArrayList<String> clasificadorDePalabras(int frecuenciaMin, HashMap<String, Integer> mapaDeFrecuencias){
        //Si el HashMap es nulo, se termina el metodo regresando un ArrayList vacio
        if(mapaDeFrecuencias==null){
            return new ArrayList<>();
        }

        //Filtra entradas nulas, selecciona las que superan la frecuencia minima, extrae la llave y genera un ArrayList
        ArrayList<String> palabrasClasificadas=mapaDeFrecuencias.entrySet().stream().filter(elemento->elemento.getValue()!=null && elemento.getKey()!=null).filter(elemento->elemento.getValue()>frecuenciaMin).map(e->e.getKey()).collect(Collectors.toCollection(ArrayList<String>::new));
        return palabrasClasificadas;
    }

    public static HashSet<String> deduplicacionDePalabras(String frase, int minimoDeLetras){
        //Si la frase es nula, se termina el metodo regresando un HashSet
        if(frase==null){
            return new HashSet<>();
        }
        //Separa por caracteres no alfanumericos, limpia vacios, convierte a minusculas, filtra por longitud y elimina duplicados en un HashSet
        return Arrays.stream(frase.split("\\W+")).filter(palabra->palabra!=null).filter(palabra->!palabra.isEmpty()).map(cadena->cadena.toLowerCase()).filter(palabra->palabra.length()>=minimoDeLetras).collect(Collectors.toCollection(HashSet<String>::new));
    }
}