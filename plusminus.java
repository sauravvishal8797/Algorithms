import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int pos = 0, neg = 0, zer = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(arr[i] > 0){
                pos = pos + 1;
            }
            else{
                if(arr[i] < 0){
                        neg = neg + 1;
                    }
                    else{
                        if(arr[i] == 0){
                            zer = zer + 1;
                        }
                    }
                    
                }
            }
            float fp = pos / n;
            float fn = neg / n;
            float fz = zer / n;
            System.out.println(fp);
            System.out.println(fn);
            System.out.println(fz);
            
            
        }
    }