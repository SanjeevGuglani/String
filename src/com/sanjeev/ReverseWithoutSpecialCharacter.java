package com.sanjeev;

import java.util.Scanner;

/**
 * Created by Sanjeev Guglani
 */
public class ReverseWithoutSpecialCharacter {

    public static String removeSpecial(char arr[]){
        char temp;
        for(int i=0,j=arr.length-1;i<j;i++,j--){
            while(i<arr.length && isSpecial(arr[i]))
                i++;
            while(j>=0 && isSpecial(arr[j]))
                j--;
            if(i<j){
                temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        return new String(arr);
    }

    public static boolean isSpecial(char c){
        return !((c>='a' && c<='z') || (c>='A' && c<='Z') ||(c>='0' && c<='9'));
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int test = cin.nextInt();
        cin.skip("[\n\r]*");
        for(int i=1;i<=test;i++){
            System.out.println(removeSpecial(cin.nextLine().toCharArray()));
        }
    }
}
