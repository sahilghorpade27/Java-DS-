import java.util.* ;
public class FirstLetterUppercase {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        String str = "hi i am shraddha" ;
        for(int i=0 ; i<str.length() ; i++){
            if(str.charAt(i) == ' '){
                sb.append(str.charAt(i));
                i++ ;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
            
        }

        System.out.println(sb.toString());


    }
}
