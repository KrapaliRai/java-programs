package com.stacks;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        System.out.println(reverseTheString("hello"));

    }

    public static String reverseTheString(String str){
//        String testString = str;
        int word_len = str.length();//max stack size
        Stacks mystack = new Stacks(word_len);

        for(int k  = 0 ; k < word_len-1; k++){
             char ch = str.charAt(k);
             mystack.push(ch);
        }

        String result = "";
        while(!mystack.isEmpty()){
            char ch = mystack.pop();
            result = result + ch;

        }

        return result;
    }
}
