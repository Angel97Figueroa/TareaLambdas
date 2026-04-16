import java.util.ArrayList;

public class Main{
    public static void main(){
        //Ejemplo del mulplicador
        ArrayList<Integer> nums=new ArrayList<>();
        for(int i=1;i<=5;i++){
            nums.add(i);
        }
        nums=Numeros.multiplicador(nums, 5);
        System.out.println(nums+"\n");

        //Ejemplo de uso del filtro selectivo
        System.out.println("Cadenas filtradas\n"+Cadenas.filtroSelectvo('a', 5)+"\n");

        //Ejemplo de uso de conversor de mayusculas
        System.out.println("Cadenas modificadas\n"+Cadenas.conversorDeMayusculas()+"\n");

        System.out.println(Numeros.cuadradosUnicos());
    }
}