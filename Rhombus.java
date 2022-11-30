import java.util.*;
public class Rhombus{
    public static void Rhombus(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //Spaces - (n-i)
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //Stars - n
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void hollow(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars 
            for(int j=1;j<=n;j++){
                //condition
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        hollow(6);
        Rhombus(3);

    }
}