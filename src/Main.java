import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main{
    public static void main(){
        //Ejemplo del mulplicador
        ArrayList<Integer> nums=new ArrayList<>();
        for(int i=1;i<=5;i++){
            nums.add(i);
        }
        nums.add(-1);
        nums.add(0);
        System.out.println("Numeros originales\n"+nums); //ArrayList sin modificar
        int factor=5; //Factor
        nums=UtileriaNumeros.multiplicador(nums, factor);
        System.out.println("Numeros multplicados por un factor de "+factor+"\n"+nums+"\n");

        //Ejemplo de uso del filtro selectivo
        int longitud=5;
        char letra='a';
        ArrayList<String> wordsList1=new ArrayList<>();
        Collections.addAll(wordsList1, "Diego","Pablo","Gael","Angel","Manuel", "Angel Shiny");

        System.out.println("Cadenas originales\n"+wordsList1); //ArrayList sin modificar
        System.out.println("Cadenas filtradas con letra prohibida "+letra+" y longitud minima de "+longitud+"\n"+ UtileriaCadenas.filtroSelectvo(letra, longitud, wordsList1)+"\n");

        //Ejemplo de uso de conversor de mayusculas
        ArrayList<String> wordsList2=new ArrayList<>();
        Collections.addAll(wordsList2, "Diego","Pablo","Gael","Angel","Manuel", "Angel Shiny");

        System.out.println("Cadenas sin modificar\n"+wordsList2); //ArrayList sin modificar
        System.out.println("Cadenas convertidas a mayusculas\n"+ UtileriaCadenas.conversorDeMayusculas(wordsList2)+"\n");

        //Ejemplo del cuadradados unicos
        ArrayList<Integer> listaNums=new ArrayList<>();
        Collections.addAll(listaNums, 1,1,2,3,5,8,13,21,34,55);

        System.out.println("Numeros unicos elevados al cuadrado\n"+ UtileriaNumeros.cuadradosUnicos(listaNums)+"\n");

        //Ejemplo del mapa de longitudes
        ArrayList<String> wordsList3=new ArrayList<>();
        Collections.addAll(wordsList3, "Diego","Pablo","Gael","Angel","Manuel", "Angel Shiny");

        System.out.println("Cadenas originales\n"+wordsList3); //ArrayList sin modificar
        System.out.println("Mapa de longitudes\n"+ UtileriaCadenas.mapaDeLongitudes(wordsList3)+"\n");

        //Ejemplo de uso de Modificador de inventarios
        HashMap<String, Double> inventario=new HashMap<>();
        inventario.put("Cloro", 100.0);
        inventario.put("Detergente", 50.0);
        inventario.put("Jabon", 30.0);

        System.out.println("Mapa original\n"+inventario); //HashMap sin modificar
        UtileriaNumeros.modificadorDeInventario(inventario);

        //EJemplo de uso de contador de frecuencias
        ArrayList<String> wordsList4=new ArrayList<>();
        Collections.addAll(wordsList4, "Diego","Pablo","Gael","Angel","Manuel","Angel","Diego","Diego","Pablo","Pablo","Pablo");
        System.out.println("Cadenas originales\n"+wordsList4);//ArrayList sin modificar
        System.out.println("Mapa de frecuencias\n"+UtileriaCadenas.contadorDeFrecuencias(wordsList4)+"\n");

        //Ejemplo de uso de clasificador de palabras
        int frecuenciaMin=2;
        ArrayList<String> wordsList5=new ArrayList<>();
        Collections.addAll(wordsList5, "Diego","Pablo","Gael","Angel","Manuel","Angel","Diego","Diego","Pablo","Pablo","Pablo");
        HashMap<String, Integer> mapaDeFrecuencias=UtileriaCadenas.contadorDeFrecuencias(wordsList5);
        System.out.println("Cadenas originales\n"+wordsList5);
        System.out.println("Mapa de frecuencias original\n"+mapaDeFrecuencias);
        System.out.println("Mapa con palabras que se repiten mas de "+frecuenciaMin+" veces\n"+UtileriaCadenas.clasificadorDePalabras(frecuenciaMin, mapaDeFrecuencias)+"\n");

        //Ejemplo de uso de deduplicacion de palabras
        String frase="¡Hola!, esta es mi fabulosa tarea hecha en Java Es";
        int letrasMinimas=2;
        System.out.println("Frase original\n"+frase);
        System.out.println("HashSet con las palabras con una cantidad de letras menor a "+letrasMinimas+" \n"+UtileriaCadenas.dedupliacionDePalabras(frase, letrasMinimas)+"\n");

        int limiteDeFrecuencia=3;
        ArrayList<String> wordsList6=new ArrayList<>();
        Collections.addAll(wordsList6, "Diego","Pablo","Gael","Angel","Manuel","Angel","Diego","Diego","Pablo","Pablo","Pablo");
        HashMap<String, Integer> mapaDeFrecuencias0=UtileriaCadenas.contadorDeFrecuencias(wordsList6);
        System.out.println("Cadenas originales\n"+wordsList6);
        System.out.println("Mapa de frecuencias original\n"+mapaDeFrecuencias0);
        UtileriaNumeros.topeDeFrecuencia(mapaDeFrecuencias0, limiteDeFrecuencia);
        System.out.println("\n\n\n\n\n\n");




        //Casos de listas y mapas vacios
        System.out.println("Los siguientes resultados son ejemplo de cuando se envian listas o mapas vacios\n\n");
        //Ejemplo del mulplicador
        nums=new ArrayList<>();

        System.out.println("Numeros originales\n"+nums); //ArrayList sin modificar
        factor=5; //Factor
        nums=UtileriaNumeros.multiplicador(nums, factor);
        System.out.println("Numeros multplicados por un factor de "+factor+"\n"+nums+"\n");

        //Ejemplo de uso del filtro selectivo
        longitud=5;
        letra='a';
        wordsList1=new ArrayList<>();

        System.out.println("Cadenas originales\n"+wordsList1); //ArrayList sin modificar
        System.out.println("Cadenas filtradas con letra prohibida "+letra+" y longitud minima de "+longitud+"\n"+ UtileriaCadenas.filtroSelectvo(letra, longitud, wordsList1)+"\n");

        //Ejemplo de uso de conversor de mayusculas
        wordsList2=new ArrayList<>();

        System.out.println("Cadenas sin modificar\n"+wordsList2); //ArrayList sin modificar
        System.out.println("Cadenas convertidas a mayusculas\n"+ UtileriaCadenas.conversorDeMayusculas(wordsList2)+"\n");

        //Ejemplo del cuadradados unicos
        listaNums=new ArrayList<>();

        System.out.println("Numeros unicos elevados al cuadrado\n"+ UtileriaNumeros.cuadradosUnicos(listaNums)+"\n");

        //Ejemplo del mapa de longitudes
        wordsList3=new ArrayList<>();

        System.out.println("Cadenas originales\n"+wordsList3); //ArrayList sin modificar
        System.out.println("Mapa de longitudes\n"+ UtileriaCadenas.mapaDeLongitudes(wordsList3)+"\n");

        //Ejemplo de uso de Modificador de inventarios
        inventario=new HashMap<>();

        System.out.println("Mapa original\n"+inventario); //HashMap sin modificar
        UtileriaNumeros.modificadorDeInventario(inventario);

        //EJemplo de uso de contador de frecuencias
        wordsList4=new ArrayList<>();
        System.out.println("Cadenas originales\n"+wordsList4);//ArrayList sin modificar
        System.out.println("Mapa de frecuencias\n"+UtileriaCadenas.contadorDeFrecuencias(wordsList4)+"\n");

        //Ejemplo de uso de clasificador de palabras
        frecuenciaMin=2;
        wordsList5=new ArrayList<>();
        mapaDeFrecuencias=UtileriaCadenas.contadorDeFrecuencias(wordsList5);

        System.out.println("Cadenas originales\n"+wordsList5);
        System.out.println("Mapa de frecuencias original\n"+mapaDeFrecuencias);
        System.out.println("Mapa con palabras que se repiten mas de "+frecuenciaMin+" veces\n"+UtileriaCadenas.clasificadorDePalabras(frecuenciaMin, mapaDeFrecuencias)+"\n");

        //Ejemplo de uso de deduplicacion de palabras
        frase="";
        letrasMinimas=5;
        System.out.println("Frase original\n"+frase);
        System.out.println("HashSet con las palabras con una cantidad de letras menor a "+letrasMinimas+" \n"+UtileriaCadenas.dedupliacionDePalabras(frase, letrasMinimas)+"\n");

        limiteDeFrecuencia=3;
        wordsList6=new ArrayList<>();
        mapaDeFrecuencias0=UtileriaCadenas.contadorDeFrecuencias(wordsList6);

        System.out.println("Cadenas originales\n"+wordsList6);
        System.out.println("Mapa de frecuencias original\n"+mapaDeFrecuencias0);
        UtileriaNumeros.topeDeFrecuencia(mapaDeFrecuencias0, limiteDeFrecuencia);
        System.out.println("\n\n\n\n\n\n");




        //Casos de listas y mapas con elementos nulos
        System.out.println("Los siguientes resultados son ejemplo de cuando se envian listas o mapas con elementos nulos\n\n");

        //Ejemplo del mulplicador
        nums=new ArrayList<>();
        for(int i=1;i<=5;i++){
            nums.add(null);
        }
        System.out.println("Numeros originales\n"+nums); //ArrayList sin modificar
        factor=5; //Factor
        nums=UtileriaNumeros.multiplicador(nums, factor);
        System.out.println("Numeros multplicados por un factor de "+factor+"\n"+nums+"\n");

        //Ejemplo de uso del filtro selectivo
        longitud=5;
        letra='a';
        wordsList1=new ArrayList<>();
        Collections.addAll(wordsList1, null,null,null,null,null,null);

        System.out.println("Cadenas originales\n"+wordsList1); //ArrayList sin modificar
        System.out.println("Cadenas filtradas con letra prohibida "+letra+" y longitud minima de "+longitud+"\n"+ UtileriaCadenas.filtroSelectvo(letra, longitud, wordsList1)+"\n");

        //Ejemplo de uso de conversor de mayusculas
        wordsList2=new ArrayList<>();
        Collections.addAll(wordsList2, null,null,null,null,null,null);

        System.out.println("Cadenas sin modificar\n"+wordsList2); //ArrayList sin modificar
        System.out.println("Cadenas convertidas a mayusculas\n"+ UtileriaCadenas.conversorDeMayusculas(wordsList2)+"\n");

        //Ejemplo del cuadradados unicos
        listaNums=new ArrayList<>();
        Collections.addAll(listaNums, null,null,null,null,null,null);

        System.out.println("Numeros unicos elevados al cuadrado\n"+ UtileriaNumeros.cuadradosUnicos(listaNums)+"\n");

        //Ejemplo del mapa de longitudes
        wordsList3=new ArrayList<>();
        Collections.addAll(wordsList3, null,null,null,null,null,null);

        System.out.println("Cadenas originales\n"+wordsList3); //ArrayList sin modificar
        System.out.println("Mapa de longitudes\n"+ UtileriaCadenas.mapaDeLongitudes(wordsList3)+"\n");

        //Ejemplo de uso de Modificador de inventarios
        inventario=new HashMap<>();
        inventario.put(null, null);
        inventario.put(null, null);
        inventario.put(null, null);

        System.out.println("Mapa original\n"+inventario); //HashMap sin modificar
        UtileriaNumeros.modificadorDeInventario(inventario);

        //EJemplo de uso de contador de frecuencias
        wordsList4=new ArrayList<>();
        Collections.addAll(wordsList4, null,null,null,null,null,null);
        System.out.println("Cadenas originales\n"+wordsList4);//ArrayList sin modificar
        System.out.println("Mapa de frecuencias\n"+UtileriaCadenas.contadorDeFrecuencias(wordsList4)+"\n");

        //Ejemplo de uso de clasificador de palabras
        frecuenciaMin=2;
        wordsList5=new ArrayList<>();
        Collections.addAll(wordsList5, null,null,null,null,null,null);
        mapaDeFrecuencias=UtileriaCadenas.contadorDeFrecuencias(wordsList5);
        System.out.println("Cadenas originales\n"+wordsList5);
        System.out.println("Mapa de frecuencias original\n"+mapaDeFrecuencias);
        System.out.println("Mapa con palabras que se repiten mas de "+frecuenciaMin+" veces\n"+UtileriaCadenas.clasificadorDePalabras(frecuenciaMin, mapaDeFrecuencias)+"\n");

        //Ejemplo de uso de deduplicacion de palabras
        frase=null;
        letrasMinimas=5;
        System.out.println("Frase original\n"+frase);
        System.out.println("HashSet con las palabras con una cantidad de letras menor a "+letrasMinimas+" \n"+UtileriaCadenas.dedupliacionDePalabras(frase, letrasMinimas)+"\n");

        limiteDeFrecuencia=3;
        wordsList6=new ArrayList<>();
        Collections.addAll(wordsList6, null,null,null,null,null,null);
        mapaDeFrecuencias0=UtileriaCadenas.contadorDeFrecuencias(wordsList6);
        System.out.println("Cadenas originales\n"+wordsList6);
        System.out.println("Mapa de frecuencias original\n"+mapaDeFrecuencias0);
        UtileriaNumeros.topeDeFrecuencia(mapaDeFrecuencias0, limiteDeFrecuencia);
        System.out.println("\n\n\n\n\n\n");





        //Casos de listas y mapas nulos

        System.out.println("Los siguientes resultados son ejemplo de cuando se envian listas o mapas nulos\n\n");
        //Ejemplo del mulplicador
        nums=null;

        System.out.println("Numeros originales\n"+nums); //ArrayList sin modificar
        factor=5; //Factor
        nums=UtileriaNumeros.multiplicador(nums, factor);
        System.out.println("Numeros multplicados por un factor de "+factor+"\n"+nums+"\n");

        //Ejemplo de uso del filtro selectivo
        longitud=5;
        letra='a';
        wordsList1=null;

        System.out.println("Cadenas originales\n"+wordsList1); //ArrayList sin modificar
        System.out.println("Cadenas filtradas con letra prohibida "+letra+" y longitud minima de "+longitud+"\n"+ UtileriaCadenas.filtroSelectvo(letra, longitud, wordsList1)+"\n");

        //Ejemplo de uso de conversor de mayusculas
        wordsList2=null;

        System.out.println("Cadenas sin modificar\n"+wordsList2); //ArrayList sin modificar
        System.out.println("Cadenas convertidas a mayusculas\n"+ UtileriaCadenas.conversorDeMayusculas(wordsList2)+"\n");

        //Ejemplo del cuadradados unicos
        listaNums=null;

        System.out.println("Numeros unicos elevados al cuadrado\n"+ UtileriaNumeros.cuadradosUnicos(listaNums)+"\n");

        //Ejemplo del mapa de longitudes
        wordsList3=null;

        System.out.println("Cadenas originales\n"+wordsList3); //ArrayList sin modificar
        System.out.println("Mapa de longitudes\n"+ UtileriaCadenas.mapaDeLongitudes(wordsList3)+"\n");

        //Ejemplo de uso de Modificador de inventarios
        inventario=null;

        System.out.println("Mapa original\n"+inventario); //HashMap sin modificar
        UtileriaNumeros.modificadorDeInventario(inventario);

        //EJemplo de uso de contador de frecuencias
        wordsList4=null;
        System.out.println("Cadenas originales\n"+wordsList4);//ArrayList sin modificar
        System.out.println("Mapa de frecuencias\n"+UtileriaCadenas.contadorDeFrecuencias(wordsList4)+"\n");

        //Ejemplo de uso de clasificador de palabras
        frecuenciaMin=2;
        wordsList5=null;
        mapaDeFrecuencias=UtileriaCadenas.contadorDeFrecuencias(wordsList5);

        System.out.println("Cadenas originales\n"+wordsList5);
        System.out.println("Mapa de frecuencias original\n"+mapaDeFrecuencias);
        System.out.println("Mapa con palabras que se repiten mas de "+frecuenciaMin+" veces\n"+UtileriaCadenas.clasificadorDePalabras(frecuenciaMin, mapaDeFrecuencias)+"\n");

        //Ejemplo de uso de deduplicacion de palabras
        frase=null;
        letrasMinimas=5;
        System.out.println("Frase original\n"+frase);
        System.out.println("HashSet con las palabras con una cantidad de letras menor a "+letrasMinimas+" \n"+UtileriaCadenas.dedupliacionDePalabras(frase, letrasMinimas)+"\n");

        limiteDeFrecuencia=3;
        wordsList6=null;
        mapaDeFrecuencias0=UtileriaCadenas.contadorDeFrecuencias(wordsList6);

        System.out.println("Cadenas originales\n"+wordsList6);
        System.out.println("Mapa de frecuencias original\n"+mapaDeFrecuencias0);
        UtileriaNumeros.topeDeFrecuencia(mapaDeFrecuencias0, limiteDeFrecuencia);
        System.out.println("\n\n\n\n\n\n");
    }
}