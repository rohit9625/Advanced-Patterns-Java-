import java.util.*;
public class invPyramid{
    public static void invPyramid(int noRows){
        //Outer loop
        for(int i=1;i<=noRows;i++){
            //Spaces
            for(int j=1;j<=(noRows-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hlfPyramid(int n){
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=(n-i+1);j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    //Floyd's Triangle
    public static void triangle(int n){
            int counter = 1;
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
                }
                System.out.println();
            }
    }    
    //0-1 Triangle
    public static void binTriangle(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                if((i+j)%2 == 0){//Even
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        // invPyramid();
        binTriangle(10);
    }
}