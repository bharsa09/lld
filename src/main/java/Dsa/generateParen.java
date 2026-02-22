package Dsa;

import java.util.*;

public class generateParen {

    static int n;
    static int k;
    static List<Character>arr=new ArrayList<>();
    static List<List<Character>>sol=new ArrayList<>();



    public static void rec(int level,int depth,int maxDepth,int left,int right){
        if(maxDepth>k){
            return;
        }
        if(level==n){
            if(maxDepth==k)
                sol.add(new ArrayList<>(arr));

            return;
        }

        if(left>0){
            arr.add('(');
            rec(level+1,depth+1,Math.max(depth+1,maxDepth),left-1,right);
            arr.remove(arr.size()-1);
        }
        if(right>left){
            arr.add(')');
            rec(level+1,depth-1,maxDepth,left,right-1);
            arr.remove(arr.size()-1);
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();

        rec(0,0,0,n/2,n/2);

        for(List<Character> ch:sol){
            StringBuilder sb=new StringBuilder();
            for(Character c:ch){
                sb.append(c);
            }
            System.out.println(sb.toString());
        }


    }
}


//  Description
//  You have given two positive integers n and k. Your task is to print all balanced parenthesis of length n in lexicographic order (https://en.wikipedia.org/wiki/Lexicographic_order) with depth exactly k.
//
//        Balanced parentheses mean that each opening symbol has a corresponding closing symbol and the pairs of parentheses are properly nested.
//
//        Note:
//
//        depth("") = 0.
//        depth('(' + A + ')) = depth(A) + 1, where A is a balanced paranthesis sequence.
//        depth(A + B) = max(depth(A), depth(B)), where A and B are both balanced paranthesis sequence.
//        depth("(") = depth(")") = 0
//
//  Input Format
//  The only line of input contains two numbers number n and k.
//
//  Output Format
//  Print all balanced parenthesis of length n with depth k in lexicographic order.
//
//        Constraints 2 ≤ n ≤ 24  && 1 ≤ k ≤ n / 2
//  It is guaranteed that n is an even number.
