package OOP;
import java.util.Scanner;
public class selectionSort {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Array length :");
        int length = input.nextInt();
        int myArray [] = new int [length];
        for (int i = 0; i <myArray.length; i++) {
           System.out.println("Enter Array index » "+i+" value :");
           myArray[i]=input.nextInt();
        }
        System.out.println("=== Array Before sorting ===");
        for (int i = 0; i <myArray.length; i++) {
            System.out.print(myArray[i]+" ");
        }
        sort(myArray);
         System.out.println("\n=== Array After sorting ===");
        for (int i = 0; i <myArray.length; i++) {
            System.out.print(myArray[i]+" ");
        }
        System.out.println();
    }
    static void sort(int array[]){
        int outer = 0;
        while(outer<array.length-1){
            int index=outer;
            int inner = outer+1;
            while(inner<array.length){
                if(array[inner]<array[index]){
                    index=inner;
                }
                inner+=1;
            }
            int temp = array[index];
            array[index] = array[outer];
            array[outer] = temp;
            outer+=1;
        }
    }
}
