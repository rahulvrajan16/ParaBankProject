package programs;

import java.util.Scanner;

public class Solution {
    public void solution(int[] A){
        System.out.println("A: "+A.length);
        for(int i=0;i<A.length;i++){
            System.out.println("hi");
        }

    }

    public static void main(String[] args) {
        int size;
        System.out.println("Enter array size");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the array numbers");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Your array numbers are: ");
        for(int i=0;i<size;i++){
            System.out.println(array);
        }
        //passing array numbers to solution
        Solution s= new Solution();
        s.solution(array);


    }
}
