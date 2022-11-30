import java.util.*;
public class HlwRect{
    //Method to print a Hollow Rectangle
    public static void hollow_rect(int noRows, int noCols){
        //outer loop
        for(int i=1;i<=noRows;i++){
            //inner loop
            for(int j=1;j<=noCols;j++){
                if(i==1 || i==noRows || j==1 || j==noCols){
                    System.out.print("* ");
                }else{System.out.print("  ");}
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of rows you want");
        int noRows = scn.nextInt();
        System.out.println("Enter the number of columns you want");
        int noCols = scn.nextInt();
        hollow_rect(noRows,noCols);
    }
}