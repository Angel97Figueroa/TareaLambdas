import java.util.*;
import java.util.stream.Collectors;

public class UtileriaCadenas {
    public static ArrayList<String> filtroSelectvo(char letraProhibida, int longitudMin, ArrayList<String> wordsList){
        wordsList.removeIf(cadena->cadena==null || cadena.toLowerCase().startsWith(String.valueOf(letraProhibida).toLowerCase()) || cadena.length()<longitudMin);
        return wordsList;
    }

    public static ArrayList<String> conversorDeMayusculas(ArrayList<String> wordsList){
        return wordsList.stream().filter(cadena->cadena!=null).map(cadena->cadena.toUpperCase()).collect(Collectors.toCollection(ArrayList<String>::new));
    }

    public static HashMap<String, Integer> mapaDeLongitudes(ArrayList<String> wordsList){
        return wordsList.stream().filter(s->s!=null).collect(Collectors.toMap(w->w,w->w.length(),(viejo, nuevo)->viejo,HashMap::new));
    }

    public static HashMap<String, Integer> contadorDeFrecuencias(ArrayList<String> wordsList){
        HashMap<String, Integer> mapaDeFrecuencias=new HashMap<>();
        wordsList.stream().filter(cadena->cadena!=null).forEach(w->mapaDeFrecuencias.merge(w,1,(viejo, nuevo)->viejo+nuevo));
        return mapaDeFrecuencias;
    }

    public static ArrayList<String> clasificadorDePalabras(int frecuenciaMin, HashMap<String, Integer> mapaDeFrecuencias){
        ArrayList<String> palabrasClasificadas=mapaDeFrecuencias.entrySet().stream().filter(elemento->elemento.getValue()!=null && elemento.getKey()!=null).filter(elemento->elemento.getValue()>frecuenciaMin).map(e->e.getKey()).collect(Collectors.toCollection(ArrayList<String>::new));
        return palabrasClasificadas;
    }

    public static HashSet<String> dedupliacionDePalabras(String frase, int minimoDeLetras){
        if(frase==null){
            return new HashSet<>();
        }
        return Arrays.stream(frase.split("\\W+")).filter(palabra->palabra!=null).filter(palabra->!palabra.isEmpty()).map(cadena->cadena.toLowerCase()).filter(palabra->palabra.length()>=minimoDeLetras).collect(Collectors.toCollection(HashSet<String>::new));
    }

    public static void topeDeFrecuencia(HashMap<String, Integer> mapaDeFrecuencias, int limiteDeFrecuencia){
        mapaDeFrecuencias.replaceAll((palabra, frecuencia)->{
            if(frecuencia!=null && palabra!=null){
                frecuencia=frecuencia>=limiteDeFrecuencia ? limiteDeFrecuencia : frecuencia.intValue();
            }else{
                return frecuencia;
            }
            return frecuencia;
        });
        System.out.println("Mapa con tope de frecuencia de "+limiteDeFrecuencia+"\n"+mapaDeFrecuencias);
    }

}
