package com.sanjeev;

import java.util.ArrayList;
import java.util.List;

class StringSubSequence {

    //Bottom Up Approach
    public  static List<String> subSequence(String str){
        List<String> list = new ArrayList<String>();
        if(str.length()==1){
            list.add("");
            list.add(str);
        }else {
            list=subSequence(str.substring(1,str.length()));
            int length = list.size();
            for(int i=0;i<length;i++){
                list.add(str.charAt(0)+list.get(i));
            }
        }
        return list;
    }
    public static void main(String[] args) {
        String str = "MEN";
        System.out.println(subSequence(str));
    }



}