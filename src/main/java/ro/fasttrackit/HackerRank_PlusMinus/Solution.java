package ro.fasttrackit.HackerRank_PlusMinus;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        int zeroNumbers = 0;
        for(int x : arr){
            if(x > 0){
                positiveNumbers++;
            } else if(x < 0){
                negativeNumbers++;
            } else {
                zeroNumbers++;
            }
        }
        System.out.println((double)positiveNumbers/arr.size());
        System.out.println((double)negativeNumbers/arr.size());
        System.out.println((double)zeroNumbers/arr.size());
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
