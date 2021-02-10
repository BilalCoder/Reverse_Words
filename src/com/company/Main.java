package com.company;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        ArrayList<String> as = new ArrayList<>();
        //StringBuffer stb = new StringBuffer(str);
        while (st.hasMoreTokens()) {
            String a = st.nextToken();
            StringBuffer stb = new StringBuffer(a);
            String stb1 = stb.reverse().toString();
            System.out.print(stb1);
            if (stb1.equals(a) && a.length()>1) {
                as.add(a);
            }
            System.out.print(" ");
        }
        System.out.println();
        if(as.size()==0){
            System.out.println("No palindrome");
            return;
        }
        for(String a : as)
            System.out.println(a);
    }
}
