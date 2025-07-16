class Solution {
    public int primePalindrome(int n) {
     int num=n;
     while(n>0){
         if(prime(num)==true && palindrome(num)==true){
             return num;
         }
             num++;
              if (num > 10000000 && num< 100000000) {
            num = 100000000; 
            }
     }
     return num;
        
    }
    public static boolean prime(int num){
        if(num<=1) return false;
        for(int i=2;i<=Math.sqrt(num);i++){
           if(num%i==0){
               return false;
           }
        }
        return true;
    }
    public static boolean palindrome(int num){
     if(num<0) return false;
     int origin=num;
     int rev=0;
     while(num>0){
         int rem=num%10;
         rev=rev*10+rem;
         num=num/10;
     }
     if(rev==origin){
         return true;
     }
     else {
         return false;
     }
    }
}