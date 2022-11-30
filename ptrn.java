import java.util.*;
public class ptrn{
    public static void pallindromic_ptrn(int n){
        // Outer loop
        for(int i=1;i<=n;i++){
            // Spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // Descending numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //Ascending numbers
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void numPyramid(int n){
        int counter = 1;
        // Outer loop
        for(int i=1;i<=n;i++){
            // Spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // Numbers
            for(int j=1;j<=i;j++){
                System.out.print(counter + " ");
            }
            counter++;
            System.out.println();
        }
    }
    public static void main(String args[]){
        pallindromic_ptrn(8);
        // numPyramid(6);
    }
}