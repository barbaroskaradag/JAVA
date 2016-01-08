/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recusive_hmw_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class baseconversion {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Decimal Integer: ");
        int n = Integer.parseInt(br.readLine());
        System.out.print("Base: ");
        int base = Integer.parseInt(br.readLine());
        String result = convert(n, base);
        System.out.println(n + " with base " + base + ": " + result);
        System.exit(1);
    }

    public static String convert(int n, int b) {
        if (n == 0) {
            return "0";
        } else {
            if (n % b >= 10) {
                return convert(n / b, b) + Character.toString((char) (n % b + 55));
            } else {
                return convert(n / b, b) + Integer.toString(n % b);
            }
        }
    }
}
