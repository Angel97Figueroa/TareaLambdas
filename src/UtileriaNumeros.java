import java.util.*;
import java.util.stream.Collectors;

public class UtileriaNumeros {
    public static ArrayList<Integer> multiplicador(ArrayList<Integer> listaNums, int factor){
        //Si el ArrayList es nulo, se termina el metodo regresando un ArrayList vacio
        if(listaNums==null){
            return new ArrayList<>();
        }

        listaNums.removeIf(n->n==null); //Se quitan los valores nulos del ArrayList
        listaNums.replaceAll(num->num.intValue()*factor);
        return listaNums;
    }

    public static HashSet<Integer> cuadradosUnicos(ArrayList<Integer> listaNums){
        //Si el ArrayList es nulo, se termina el metodo regresando un HashSet vacio
        if(listaNums==null){
            return new HashSet<>();
        }

        HashSet<Integer> listaNumsUnicos=(HashSet<Integer>)listaNums.stream().filter(n->n!=null).filter(num->num%2==0).map(num->num*num).collect(Collectors.toSet());
        System.out.println("Numeros originales\n"+listaNums); //ArrayList sin modificar
        return listaNumsUnicos;
    }

    public static void modificadorDeInventario(HashMap<String, Double> inventario){
        //Si el HashMap es nulo, se termina el metodo
        if(inventario==null){
            System.out.println("El HashMap enviado es null, no se trabajó con él");
            return;
        }

        System.out.println("Mapa con el descuento aplicado");
        inventario.entrySet().stream().filter(elemento->elemento.getValue()!=null && elemento.getKey()!=null).forEach(elemento->System.out.println(elemento.getKey()+" "+elemento.getValue().doubleValue()*0.9));
        System.out.println(" ");
    }

    public static void topeDeFrecuencia(HashMap<String, Integer> mapaDeFrecuencias, int limiteDeFrecuencia){
        //Si el HashMap es nulo, se termina el metodo
        if(mapaDeFrecuencias==null){
            System.out.println("El HashMap enviado es null, no se trabajó con él");
            return;
        }
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
