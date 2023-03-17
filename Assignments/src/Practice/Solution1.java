package Practice;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution1 {

    // Complete the averageOfTopEmployees function below.
    static void averageOfTopEmployees(int[] rating) {
        int len=rating.length;
        int count=0;
        ArrayList<Integer> countList=new ArrayList<>();
        for(int i=0;i<len;i++){
            if(rating[i]>=90 && rating[i]<=100)
            {
                countList.add(rating[i]);
            }
            
        }
        for(int j=0;j<countList.size();j++){
            count=count+countList.get(j);
        }
        
        double c=count/countList.size();
       double c1=Math.round(c*100.0)/100.0;
        System.out.println(c1);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] rating = new int[98,97,60,97,94,90];
       // rating=;

//        for (int ratingItr = 0; ratingItr < n; ratingItr++) {
//            int ratingItem = scanner.nextInt();
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//            rating[ratingItr] = ratingItem;
//        }

        averageOfTopEmployees(rating);

        scanner.close();
    }
}
