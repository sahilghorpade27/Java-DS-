import java.util.Arrays;

public class MinAbsDifference {
    public static void main(String[] args) {
        int a[] = {4,1,8,7};
        int b[]= {2,3,6,5};

        Arrays.sort(a);
        Arrays.sort(b);

        int ans = 0 ;

        for(int i=0 ; i< a.length ; i++){
            int res = a[i] - b[i] ;
            ans += Math.abs(res);
        }

        System.out.println(ans);
    }
}
