import java.util.*;
import java.util.stream.Collectors;

public class UtileriaNumeros {
    public static ArrayList<Integer> multiplicador(ArrayList<Integer> listaNums, int factor){
        listaNums.removeIf(n->n==null); //Se quitan los valores nulos del ArrayList
        listaNums.replaceAll(num->num.intValue()*factor);
        return listaNums;
    }

    public static HashSet<Integer> cuadradosUnicos(ArrayList<Integer> listaNums){
        HashSet<Integer> listaNumsUnicos=(HashSet<Integer>)listaNums.stream().filter(n->n!=null).filter(num->num%2==0).map(num->num*num).collect(Collectors.toSet());
        System.out.println("Numeros originales\n"+listaNums); //ArrayList sin modificar
        return listaNumsUnicos;
    }

    public static void modificadorDeInventario(HashMap<String, Double> inventario){
        System.out.println("Mapa con el descuento aplicado");
        inventario.entrySet().stream().filter(elemento->elemento.getValue()!=null && elemento.getKey()!=null).forEach(elemento->System.out.println(elemento.getKey()+" "+elemento.getValue().doubleValue()*0.9));
        System.out.println(" ");
    }
}
