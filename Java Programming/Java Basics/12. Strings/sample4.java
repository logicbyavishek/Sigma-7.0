import java.util.*;
public class sample4 {
    public static float getshortestpath(String path){
        int x=0 , y=0,n=path.length();
        for(int i=0; i<n;i++){
            char dir = path.charAt(i);
            //south
            if(dir=='S'){
                y--;
            }
            //north
            else if(dir=='N'){
                y++;
            }
            // west
            else if(dir=='W'){
                x--;
            }
            //east
            else{
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;

        return (float) Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";

        System.out.println("The shortest path :"+getshortestpath(path));
    }
}
