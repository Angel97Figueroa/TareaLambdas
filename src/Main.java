import java.util.ArrayList;

public class Main{
    public static void main(){
        //Ejemplo del mulplicador
        ArrayList<Integer> nums=new ArrayList<>();
        for(int i=1;i<=5;i++){
            nums.add(i);
        }
        System.out.println("Numeros originales\n"+nums); //ArrayList sin modificar
        int factor=5; //Factor
        nums=UtileriaNumeros.multiplicador(nums, factor);
        System.out.println("Numeros multplicados por un factor de "+factor+"\n"+nums+"\n");

        //Ejemplo de uso del filtro selectivo
        int longitud=5;
        char letra='a';
        System.out.println("Cadenas filtradas con letra prohibida "+letra+" y longitud minima de "+longitud+"\n"+ UtileriaCadenas.filtroSelectvo(letra, longitud)+"\n");

        //Ejemplo de uso de conversor de mayusculas
        System.out.println("Cadenas convertidas a mayusculas\n"+ UtileriaCadenas.conversorDeMayusculas()+"\n");

        //Ejemplo del cuadradados unicos
        System.out.println("Numeros unicos elevados al cuadrado\n"+ UtileriaNumeros.cuadradosUnicos()+"\n");

        //Ejemplo del mapa de longitudes
        System.out.println("Mapa de longitudes\n"+ UtileriaCadenas.mapaDeLongitudes()+"\n");

        //Ejemplo de uso de Modificador de inventarios
        UtileriaNumeros.modificadorDeInventario();

        //EJemplo de uso de contador de frecuencias
        System.out.println("Mapa de frecuencias\n"+UtileriaCadenas.contadorDeFrecuencias()+"\n");

        int frecuenciaMin=2;
        System.out.println("Mapa con palabras que se repiten mas de "+frecuenciaMin+" veces\n"+UtileriaCadenas.clasificadorDePalabras(frecuenciaMin)+"\n");
    }
}