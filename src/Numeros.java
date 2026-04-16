import java.util.ArrayList;

public class Numeros {
    public static ArrayList<Integer> multiplicador(ArrayList<Integer> listaNums, int factor){
        listaNums.replaceAll(num->num.intValue()*factor);
        return listaNums;
    }
}
