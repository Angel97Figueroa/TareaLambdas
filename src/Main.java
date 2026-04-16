import java.util.ArrayList;

public class Main{
    public static void main(){
        //Ejemplo de mulplicador
        ArrayList<Integer> nums=new ArrayList<>();
        for(int i=1;i<=5;i++){
            nums.add(i);
        }
        nums=Numeros.multiplicador(nums, 5);
        System.out.println(nums);
    }
}