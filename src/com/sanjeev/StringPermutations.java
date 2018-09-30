package com.sanjeev;

import java.util.ArrayList;
import java.util.List;

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

    public static List<String> permutation(String str){
        List<String> list=new ArrayList<String>();
        if(str.equals("")){
            list.add("");
        }else {
            for(int i=0;i<str.length();i++){
                List<String> temp = permutation(str.substring(0,i)+str.substring(i+1));
                for(int j=0;j<temp.size();j++){
                   list.add(str.charAt(i)+temp.get(j));
                }
            }
        }
        return list;
    }
    
    public static void main(String[] args) {
        String str ="MEN";
        printPermutations(str,0);
        System.out.println(permutation("MEN"));
    }
}
