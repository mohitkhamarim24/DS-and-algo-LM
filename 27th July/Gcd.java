public class Gcd {
    
     public static int funct(int a, int b){
       
        //bruthforce solutions
        /*int n = Math.min(a,b);
        int max = 1;
        for(int i = 1 ; i <= n ; i++){
            if(b%i==0 && a%i==0){
                max = Math.max(max,i);
            }
        }
        return max;
     }/* */
        //using Recursive 
        if(b==0){
            return a;
        }

        return funct(b,a%b);
     }

 public static void main(String args[])
    {
       int a = 60;
       int b = 12;

       System.out.println("ans is " + funct(a,b));
      
    }
}
