package com.tsun.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BinarySearch{
    public static void main(String...args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter space separate integers: ");
        StringBuilder intString = new StringBuilder(input.nextLine());
        String[] intStringArray = intString.toString().split(" ");
        int[] intArray = new int[intStringArray.length];
        for(int i = 0 ; i < intStringArray.length ; i++){
            intArray[i] = Integer.parseInt(intStringArray[i]);
        }
        System.out.println("Enter the integer to search (Integer): ");
        int target = input.nextInt();
        long result = Arrays.stream(intArray).filter(i -> i == target).count();
        if(result != 0){
            System.out.println("Found!");
        }else{
            System.out.println("Not found!");
        }
    }
}