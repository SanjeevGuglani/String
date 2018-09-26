package com.sanjeev;

/**
 * Created by Sanjeev Guglani
 */
public class StringPermutations {


    public static void printPermutations(String str,int i){
        if(i==str.length()-1){
            System.out.println(str);
        }else {
            for(int j=i;j<str.length();j++){
                char temp[]=str.toCharArray();
                char t = temp[i];
                temp[i]=temp[j];
                temp[j]=t;
                printPermutations(new String(temp),i+1);
            }
        }
    }
    public static void main(String[] args) {
        String str ="MEN";
        printPermutations(str,0);
    }
}
