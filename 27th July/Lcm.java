public class Lcm {
    
     public static int gcd(int a, int b){
        if(b==0){
            return a;
        }

        return gcd(b,a%b);
     }
      public static int lcm(int[] arr){
        
        int lcm1 =  arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            int gcdval = gcd(lcm1,arr[i]);
            lcm1 = (lcm1 * arr[i])/gcdval;
        }
        return lcm1;
     }

 public static void main(String args[])
    {
       int[] arr = {1,2,8,3};

       System.out.println("ans is " + lcm(arr));
      
    }
}
