package Dsa;
import java.util.*;

public class nQueen {


    static int ans=0;

    public static void count(int level,char[][] grid,List<Integer> arr){
        if(level==8){
            ans++;
            return;
        }

        for(int i=0;i<8;i++){
            if(grid[level][i]!='*' && check(level,i,arr)){
                arr.add(i);
                count(level+1,grid,arr);
                arr.remove(arr.size()-1);
            }
        }

    }

    public static boolean check(int row,int col,List<Integer> arr){

        for(int i=0;i<row;i++){
            if(arr.get(i).equals(col)) return false;
            if(Math.abs(row-i)==Math.abs(col-arr.get(i))) return false;
        }
        return true;
    }

    public static void main(String[] args){
        List<Integer>arr=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        char[][] grid=new char[8][8];

        for(int i=0;i<8;i++){
            String line=sc.nextLine();
            for(int j=0;j<8;j++){
                grid[i][j]=line.charAt(j);
            }
        }
        count(0,grid,arr);
        System.out.println(ans);
    }
}