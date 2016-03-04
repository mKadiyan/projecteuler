package com.home.hackersearth;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine().trim();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            String[] temp = br.readLine().split(" ");
            System.out.println(Arrays.toString(temp));
                int tot = Integer.parseInt(temp[0].trim());
                int sum = Integer.parseInt(temp[1].trim());
            System.out.println("tot = " + tot);
            System.out.println("sum = " + sum);
                int[] cost = new int[tot];
                int start = 0;
                int end = -1;
                int total = 0;
            boolean flag = true;
                for (int j = 0; j < tot; j++) {
                    cost[j] = Integer.parseInt(br.readLine().trim());
                if (flag)
                {
                    total += cost[j];
                    end++;
                    if(total > sum)
                    {
                        for(int k = start;k<=end;k++)
                        {
                            total -=cost[start++];
                            if(total <= sum)
                                break;
                        }
                    }
                    if (total == sum)
                        flag = false;
                }
                }
                if(total == sum)
                    System.out.println("YES");
                else
                    System.out.println("NO");
        }
    }
}
