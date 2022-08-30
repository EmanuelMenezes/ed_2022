import java.util.Random;

public class ex2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        boolean[] primos = new boolean[10];
        int count_primos = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
            primos[i] = true;
            for(int j = (arr[i]-1); j > 1; j--){
                if(arr[i]%j == 0){
                    primos[i] = false;
                }
            }
        }
        for (int i = 0; i < primos.length; i++){
            if(primos[i]){
                System.out.print(i+" -> "+ arr[i] + "\n");
            }

        }
        
    }
}
