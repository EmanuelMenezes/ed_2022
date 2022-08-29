import java.util.Random;

public class ex2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        int[] primos = new int[1];
        int count_primos = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
            for(int j = i; j > 0; j--){
                if(arr[i]%j == 0){
                    count_primos++;
                    int[] aux = new int[count_primos];
                    aux = primos;
                        
                    primos = new int[count_primos];
                    primos = aux;
                    break;
                }
            }
        }
        for (int i = 0; i < primos.length; i++){
            System.out.print(primos[i]);
        }
        
    }
}
