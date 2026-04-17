import java.util.ArrayList;

public class Main{
    public static void main(){
        //Ejemplo del mulplicador
        ArrayList<Integer> nums=new ArrayList<>();
        for(int i=1;i<=5;i++){
            nums.add(i);
        }
        System.out.println("Numeros originales\n"+nums); //ArrayList sin modificar
        int n=5; //Factor
        nums=Numeros.multiplicador(nums, n);
        System.out.println("Numeros multplicados por un factor de "+n+"\n"+nums+"\n");

        //Ejemplo de uso del filtro selectivo
        System.out.println("Cadenas filtradas\n"+Cadenas.filtroSelectvo('a', 5)+"\n");

        //Ejemplo de uso de conversor de mayusculas
        System.out.println("Cadenas convertidas a mayusculas\n"+Cadenas.conversorDeMayusculas()+"\n");

        //Ejemplo del cuadradados unicos
        System.out.println("Numeros unicos elevados al cuadrado\n"+Numeros.cuadradosUnicos()+"\n");

    }
}