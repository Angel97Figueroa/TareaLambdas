import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

public class UtileriaNumeros {
    public static ArrayList<Integer> multiplicador(ArrayList<Integer> listaNums, int factor){
        listaNums.replaceAll(num->num.intValue()*factor);
        return listaNums;
    }

    public static HashSet<Integer> cuadradosUnicos(){
        ArrayList<Integer> listaNums=new ArrayList<>();
        Collections.addAll(listaNums, 1,1,2,3,5,8,13,21,34,55);

        HashSet<Integer> listaNumsUnicos=(HashSet<Integer>)listaNums.stream().filter(num->num%2==0).map(num->num*num).collect(Collectors.toSet());
        System.out.println("Numeros originales\n"+listaNums); //ArrayList sin modificar
        return listaNumsUnicos;
    }

    public static void modificadorDeInventario(){
        HashMap<String, Double> inventario=new HashMap<>();
        inventario.put("Cloro", 100.0);
        inventario.put("Detergente", 50.0);
        inventario.put("Jabon", 30.0);
        System.out.println("Mapa original\n"+inventario); //HashMap sin modificar
        System.out.println("Mapa con el descuento aplicado");
        inventario.forEach((producto, precio)->System.out.println(producto+" "+precio.doubleValue()*0.9));
        System.out.println(" ");
    }
}
