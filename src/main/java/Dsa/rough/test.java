package Dsa.rough;

import java.util.*;

public class test{

    static int ans=0;
    static int[] map=new int[1000000];

    public static void solve(int[] arr,int d){

        int n=arr.length;
        //head and tail
        int tail=0;
        int head=-1;

        //Data Structure for window
        int min=0;
        int distinctCnt=0;
        int len=10;


        while(tail<n){

            //eat while head can head under the criteria
            while((head+1<n) && len<d){

                map[arr[head+1]]++;

                if(map[arr[head+1]]==0){
                    distinctCnt++;
                }
                head++;
                len++;
            }
            //each window length
            len=0;
            ans=Math.min(ans,distinctCnt);

            if(tail>head){
                tail++;
                head=tail-1;
            }else{
                //while removing the tail also update the ans
                map[arr[tail]]--;
                if(map[arr[tail]]==0){
                    distinctCnt--;
                }
                tail=head;
            }
        }

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int d=sc.nextInt();
            int[] arr=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }
            solve(arr,d);
            System.out.println(ans);
            ans=0;
        }

    }
}




//import java.util.*;
//
//public class Main{
//
//    static int ans=Integer.MAX_VALUE;
//    static int[] map=new int[1000000];
//
//    public static void solve(int[] arr,int d){
//
//        int n=arr.length;
//        //head and tail
//        int tail=0;
//        int head=-1;
//
//        //Data Structure for window
//        int min=0;
//        int distinctCnt=Integer.MAX_VALUE;
//        int len=0;
//
//
//        while(tail<n){
//
//            //eat while head can head under the criteria
//            while((head+1<n) && len<d ){
//
//                if(map[arr[head+1]]==0){
//                    distinctCnt++;
//                }
//                map[arr[head+1]]++;
//                head++;
//                len++;
//            }
//            //each window length
//
//            ans=Math.min(ans,distinctCnt);
//            while(len>0){
//                map[arr[tail+len]]=0;
//                len--;
//            }
//            distinctCnt=0;
//            tail++;
//            head=tail-1;
//
//
//        }
//
//    }
//
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int t=sc.nextInt();
//        for(int i=0;i<t;i++){
//            int n=sc.nextInt();
//            int d=sc.nextInt();
//            int[] arr=new int[n];
//            for(int j=0;j<n;j++){
//                arr[j]=sc.nextInt();
//            }
//            solve(arr,d);
//            System.out.println(ans);
//            ans=0;
//        }
//
//    }
//}
