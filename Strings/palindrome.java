public class palindrome {
    public static void main(String[] args) {
        String str = "noon";
        boolean isPalindrome = true ;
        for(int i=0 ; i<str.length()/2 ; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                isPalindrome = false ;
                break ;
            }
        }
        if(isPalindrome){
            System.out.println("Str is Palindrome");
        }
        else{
            System.out.println("no");
        }

        System.out.println(str.substring(0, 3));
    }
}
