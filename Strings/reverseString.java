public class reverseString {

    public static String reverse(String str){
        String reversed = "";
        for(int i= str.length()-1 ; i>=0 ; i--){
            reversed += str.charAt(i) ;
        }
        return reversed ;
    }
    public static void main(String[] args) {
        String str = "abcdefg";
        System.out.println(reverse(str));
    }
}

