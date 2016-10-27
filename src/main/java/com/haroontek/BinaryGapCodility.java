package com.haroontek;

import java.util.stream.Stream;

public class BinaryGapCodility {

    public static void main(String[] a)
    {
        int v = 561892;
        new BinaryGapCodility().solution(v);
        System.out.println(new BinaryGapCodility().solution2(v));
    }
    public int solution(int N) {
       int n = 0;

        String bin = Integer.toString(N,2);
        System.out.println(bin);
        int ind = bin.indexOf('1');
        int prvInd = ind;
        int gap = 0;
        while (ind!=-1 && bin.length()>ind+1) {
            ind = bin.indexOf('1', ind+1);
            if(ind == -1)
                break;
            if(gap<(ind-prvInd)) {
                gap = ind - prvInd-1;
            }
            prvInd = ind;
        }


        System.out.println("gap : "+gap);
        return gap;
    }

    public int solution2(int N)
    {
        System.out.println(Integer.toBinaryString(N));
        return Stream.of(Integer.toBinaryString(N).replaceAll("0+$","")
                .split("1+")
        ).filter(a->a!= null)
                .map(String::length)
                .max(Integer::compare)
                .orElse(0);

    }


}