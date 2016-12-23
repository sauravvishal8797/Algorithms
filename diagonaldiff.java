import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int s1 = 0, s2 = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                if(a_j == n - a_i - 1){
                    s2 = s2 + a[a_i][a_j];
                }
                if(a_i == a_j){
                    s1 = s1 + a[a_i][a_j];
                }
            }
        }
        if(s1 > s2){
            System.out.println(s1 - s2);
        }
        else{
            System.out.println(s2 - s1);
        }
        
        
    }
}
