public class palindrome {
    public static void main(String[] args) {
        String str = "racecar";
        boolean isPalindrome = true ;
        int n = str.length() ;
        int st =0 ; 
        int end = n-1 ;
        while(st < end){
            if(str.charAt(st) != str.charAt(end)){
                isPalindrome = false ;
                break ;
            }
            st++ ;
            end-- ;
        }
        System.out.println(isPalindrome);
        
    }
}
