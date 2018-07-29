/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;
/**
 *
 * @author Anjel
 */
public class TestMulti {
    public static void main(String arga[]){
        int a[][]= new int [3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements");
        for(int i=0; i<3; i++){
            for(int j =0; j<3; j++){
                a[i][j] = sc.nextInt();
                
            }
        }
        System.out.println("----The Elements are -----");
        for (int i= 0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println(a[i][j]);
            }
        }
        //System.out.println();
    }
}
