public class PrintBinStrings {

    public static void printstr(int n , int lp , StringBuilder sb){
        //base 
        if(n==0){
            System.out.println(sb);
            return ;
        }

        // kaam 
        printstr(n-1, 0, sb.append("0"));
        if(lp == 0){
            printstr(n-1, 1 , sb.append("1"));
        }
    }
    public static void main(String[] args) {
        printstr(3, 0, new StringBuilder(""));
    }
}
