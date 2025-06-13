public class foundfirst {

    public static char firstchar(String s){
        

        for(int i=0 ; i<s.length() ; i++){
            boolean found = false ;
            for(int j= i+1 ; j<s.length() ; j++){
                if(i!= j && s.charAt(i) == s.charAt(j)){
                    found = true ;
                    break ;
                }
                

            }
            if(found == false){
                return s.charAt(i);
            }
            
        }
        return '$' ;
        
    }
    public static void main(String[] args) {
        String s = "racecar" ;
        System.out.println(firstchar(s));

    }
}
