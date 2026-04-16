import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Numeros {
    public static ArrayList<Integer> multiplicador(ArrayList<Integer> listaNums, int factor){
        listaNums.replaceAll(num->num.intValue()*factor);
        return listaNums;
    }

    public static HashSet<Integer> cuadradosUnicos(){
        ArrayList<Integer> listaNums=new ArrayList<>();
        Collections.addAll(listaNums, 1,1,2,3,5,8,13,21,34,55);

        HashSet<Integer> listaNumsUnicos=(HashSet<Integer>)listaNums.stream().filter(num->num%2==0).map(num->num*num).collect(Collectors.toSet());
        return listaNumsUnicos;
    }
}
