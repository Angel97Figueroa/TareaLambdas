import java.util.ArrayList;
import java.util.HashMap;

public class MainListasYMapasVacios {
    public static void main(){
        //Ejemplo del mulplicador
        ArrayList<Integer> nums=new ArrayList<>();

        System.out.println("Numeros originales\n"+nums); //ArrayList sin modificar
        int factor=5; //Factor
        nums=UtileriaNumeros.multiplicador(nums, factor);
        System.out.println("Numeros multplicados por un factor de "+factor+"\n"+nums+"\n");

        //Ejemplo de uso del filtro selectivo
        int longitud=5;
        char letra='a';
        ArrayList<String> wordsList1=new ArrayList<>();

        System.out.println("Cadenas originales\n"+wordsList1); //ArrayList sin modificar
        System.out.println("Cadenas filtradas con letra prohibida "+letra+" y longitud minima de "+longitud+"\n"+ UtileriaCadenas.filtroSelectvo(letra, longitud, wordsList1)+"\n");

        //Ejemplo de uso de conversor de mayusculas
        ArrayList<String> wordsList2=new ArrayList<>();

        System.out.println("Cadenas sin modificar\n"+wordsList2); //ArrayList sin modificar
        System.out.println("Cadenas convertidas a mayusculas\n"+ UtileriaCadenas.conversorDeMayusculas(wordsList2)+"\n");

        //Ejemplo del cuadradados unicos
        ArrayList<Integer> listaNums=new ArrayList<>();

        System.out.println("Numeros unicos elevados al cuadrado\n"+ UtileriaNumeros.cuadradosUnicos(listaNums)+"\n");

        //Ejemplo del mapa de longitudes
        ArrayList<String> wordsList3=new ArrayList<>();

        System.out.println("Cadenas originales\n"+wordsList3); //ArrayList sin modificar
        System.out.println("Mapa de longitudes\n"+ UtileriaCadenas.mapaDeLongitudes(wordsList3)+"\n");

        //Ejemplo de uso de Modificador de inventarios
        HashMap<String, Double> inventario=new HashMap<>();

        System.out.println("Mapa original\n"+inventario); //HashMap sin modificar
        UtileriaNumeros.modificadorDeInventario(inventario);

        //EJemplo de uso de contador de frecuencias
        ArrayList<String> wordsList4=new ArrayList<>();
        System.out.println("Cadenas originales\n"+wordsList4);//ArrayList sin modificar
        System.out.println("Mapa de frecuencias\n"+UtileriaCadenas.contadorDeFrecuencias(wordsList4)+"\n");

        //Ejemplo de uso de clasificador de palabras
        int frecuenciaMin=2;
        ArrayList<String> wordsList5=new ArrayList<>();
        HashMap<String, Integer> mapaDeFrecuencias=UtileriaCadenas.contadorDeFrecuencias(wordsList5);

        System.out.println("Cadenas originales\n"+wordsList5);
        System.out.println("Mapa de frecuencias original\n"+mapaDeFrecuencias);
        System.out.println("Mapa con palabras que se repiten mas de "+frecuenciaMin+" veces\n"+UtileriaCadenas.clasificadorDePalabras(frecuenciaMin, mapaDeFrecuencias)+"\n");

        //Ejemplo de uso de deduplicacion de palabras
        String frase="";
        int letrasMinimas=5;
        System.out.println("Frase original\n"+frase);
        System.out.println("HashSet con las palabras con una cantidad de letras menor a "+letrasMinimas+" \n"+UtileriaCadenas.dedupliacionDePalabras(frase, letrasMinimas)+"\n");

        int limiteDeFrecuencia=3;
        ArrayList<String> wordsList6=new ArrayList<>();
        HashMap<String, Integer> mapaDeFrecuencias0=UtileriaCadenas.contadorDeFrecuencias(wordsList6);

        System.out.println("Cadenas originales\n"+wordsList6);
        System.out.println("Mapa de frecuencias original\n"+mapaDeFrecuencias0);
        System.out.println("Mapa con tope de frecuencia de "+limiteDeFrecuencia+"\n"+UtileriaCadenas.topeDeFrecuencia(mapaDeFrecuencias0, limiteDeFrecuencia));
    }
}
