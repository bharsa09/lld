package Dsa.BinarySearch;


public class upperLowerBound {

    public static boolean checkUB(int[] arr,int x,int mid){
        return arr[mid]>x;
    }

    public static int upperBound(int[] arr,int x){
        int lo=0;
        int hi=arr.length-1;
        int ans=arr.length;
        while(lo<=hi){
            int mid=lo + (hi-lo)/2;
            if(checkUB(arr,x,mid)){
                ans=mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return ans;
    }

    public static boolean checkLB(int[] arr,int x,int mid){
        return arr[mid]>=x;
    }
    public static int lowerBound(int[] arr,int x){
        int lo=0;
        int hi=arr.length-1;
        int ans=arr.length;
        while(lo<=hi){
            int mid=lo + (hi-lo)/2;
            if(checkLB(arr,x,mid)){
                ans=mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={1,2,2,2,3,4,5,6};
        int target=11;
        System.out.println(upperBound(arr,target));
        System.out.println(lowerBound(arr,target));
    }
}
