import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        long sum = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Long arr[] = new Long[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextLong();
        }
        for(int arr_i=0; arr_i < n; arr_i++){
            sum = sum + arr[arr_i];
        }
        System.out.println(sum);
    }
}
