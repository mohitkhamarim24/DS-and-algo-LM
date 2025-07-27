import java.util.ArrayList;
import java.util.List;
import java.util.Arrays; 

public class PrintPrime {
    public static int[] printn(int n) {
      //bruthforce
   /* 
        List<Integer> ans = new ArrayList<>();
        if(n>=2){
            ans.add(2);
        }
        for(int i = 3 ; i <= n ; i++){
            boolean isPrime = true;
            for(int j = 2 ; j * j <= i ; j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
            ans.add(i);
            }
        }
        int[] arr = new int[ans.size()];
        for(int i = 0 ; i < ans.size() ; i++){
            arr[i] = ans.get(i);
        }
        return arr;
    }
}*/
        boolean[] boolval = new boolean[n + 1];  
        Arrays.fill(boolval, true);

        if (n >= 0) boolval[0] = false;
        if (n >= 1) boolval[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (boolval[i]) {
                for (int j = i * i; j <= n; j += i) {
                    boolval[j] = false;
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (boolval[i]) {
                list.add(i);
            }
        }

        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        int N = 45;
    
        int[] primes = printn(N); 
        System.out.println(Arrays.toString(primes)); 
    }
}
