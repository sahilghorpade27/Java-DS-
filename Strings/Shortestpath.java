public class Shortestpath {

    public static float shortest(String str){
        int x = 0;
        int y = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'N'){
                y++;
            }
            else if (str.charAt(i) == 'S') {
                y--;                
            }
            else if (str.charAt(i) == 'E') {
                x++;                
            }
            else if (str.charAt(i) == 'W') {
                x--;                
            }
        }
        int finalx = x * x;
        int finaly = y * y;

        return (float) Math.sqrt(finaly + finalx);
        
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN" ;

        System.out.println(shortest(str));

    }
}
