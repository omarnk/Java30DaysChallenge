package com.solution.dictionariesandmaps;

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []arg){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            in.nextLine();
            //n = phoneBook.size();
            phoneBook.put(name, phone);
            // Write code here
            //System.out.println(n);
            //System.out.println(name + "=" + phoneBook.get(name));

        }
        //System.out.println(phoneBook.size());
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if (phoneBook.get(s) == null){
               System.out.println("Not found"); 
            }
            else{
               System.out.println(s  + "=" + phoneBook.get(s));
            }
        }
        in.close();
    }
}