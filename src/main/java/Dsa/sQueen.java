package Dsa;

import java.util.*;

public class sQueen {
    static int n;
    static int[] board;
    static int ans=0;

    public static void sQueenCount(int level){

        if(level==n){
            ans++;
            return;
        }

        for(int i=0;i<n;i++){
            if(check(level,i)){
                board[level]=i;
                sQueenCount(level+1);
            }
        }
    }

    public static boolean check(int row,int col){
        for(int i=0;i<row;i++){
            int dr=Math.abs(i-row);
            int dc=Math.abs(board[i]-col);
            if(board[i]==col) return false;
            if(Math.abs(i-row)==Math.abs(board[i]-col)) return false;
            if((dr==2 && dc==1) || (dc==2&&dr==1)) return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        board=new int[n];

        sQueenCount(0);
        System.out.println(ans);
    }
}

// this question is variation of n-queen where in addition to normal queen moves we have to also consider knight moves while placing queens