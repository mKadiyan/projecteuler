package com.home.hackersearth;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TerribleChandu {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        char[] temp;
        char[] charArray;
        for (int i = 0; i < N; i++) {
            charArray = br.readLine().toCharArray();
            int length = charArray.length;
            temp = new char[length];
            for (int j = 0; j < length; j++)
            {
                temp[length-j-1] = charArray[j];
            }
            System.out.println(temp);
            
        }
    }
}