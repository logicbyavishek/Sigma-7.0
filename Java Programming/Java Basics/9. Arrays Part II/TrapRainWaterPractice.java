public class TrapRainWaterPractice {
    public static void main(String[] args) {
        int height[]={10,4,3,2,0,10,5,3,12};
        System.out.println("Total Quantity of Trapped Rain Water :"+TrapWater(height));
    }

    public static int TrapWater(int height[]){
        int n = height.length;

        // leftmax-->
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i =1 ; i<n ; i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }

        // Rightmax-->
        int rightmax[]= new int[n];
        rightmax[n-1]=height[n-1];
        for(int i = n-2 ; i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }

        // trapwater-->
        int trapwater=0;
        for(int i =0 ; i<n ; i++){
            int waterLevel=Math.min(leftmax[i],rightmax[i]);
            trapwater+=(waterLevel-height[i]);
        }
        return trapwater;
    }
}
