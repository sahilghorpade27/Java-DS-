public class trappingrainwater {
    public static void main(String[] args) {
        int height[] = { 4,2,0,6,3,2,5} ;
        int n = height.length ;
        int leftheightmax[] = new int [n];
        int rightheightmax[] = new int[n];
        // left max height 
        leftheightmax[0] = height[0];
        for(int i=1 ; i<n ; i++){
            leftheightmax[i] = Math.max(height[i],leftheightmax[i-1]);
        }
        //right max height
        rightheightmax[n-1] = height[n-1];
        for(int i=(n-2) ; i>=0 ; i--){
            rightheightmax[i] = Math.max(rightheightmax[i+1],height[i]);
        }

        // minimum of left and right 
        int trappedwater = 0 ;
        int minheightofwater[] = new int[n];
        for(int i=0 ; i<n ; i++){
            minheightofwater[i] = Math.min(leftheightmax[i] , rightheightmax[i]);
            trappedwater = trappedwater + (minheightofwater[i] - height[i]);
        }

        //trapped water
        System.out.println(trappedwater);
    }
}
