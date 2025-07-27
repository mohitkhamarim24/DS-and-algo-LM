public class decimal {
    
   public static int binaryToDecimal(String b) {
        // Code here
        int decimal = 0;
        int k = 0;
        for(int i = b.length()-1 ; i >=0 ;i--){
            decimal += Character.getNumericValue(b.charAt(i)) * pow2(k);
            k++;
        }
        return decimal;
    }
    
    public static int pow2(int k){
        if(k==0){
            return 1;
        }
        int ans = 1;
        for(int i=1 ; i <= k ; i++){
            ans*=2;
        }
        return ans;
    }
 public static void main(String args[])
    {
    String num = "10101001";
        System.out.println("ans is" +binaryToDecimal(num));
      
    }
}
