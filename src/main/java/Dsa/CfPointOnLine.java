package Dsa;
import java.util.*;

public class CfPointOnLine {

    static int upperBound(long[] arr, long val) {
        int lo = 0, hi = arr.length;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] <= val) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long d = sc.nextLong();

        long[] x = new long[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextLong();
        }

        long ans = 0;

        for (int i = 0; i < n; i++) {
            int r = upperBound(x, x[i] + d);
            int len = r - i - 1;
            if (len >= 2) {
                ans += (long) len * (len - 1) / 2;
            }
        }

        System.out.println(ans);
    }
}



//question:
// https://codeforces.com/problemset/problem/251/A
//this is BS on every point to find how many points are there in range x[i]+d
//also known as BS on every start.
