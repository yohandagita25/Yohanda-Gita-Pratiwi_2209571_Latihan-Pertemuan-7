/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan7;

import java.util.Scanner;

/**
 *
 * @author Yohanda Gita Pratiwi */
public class Latihan7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        LinearEquation linier = new LinearEquation();
        
        System.out.println("Masukan nilai a: ");
        int a = input.nextInt();
        linier.getA(a);
        
        System.out.println("Masukan nilai b: ");
        int b = input.nextInt();
        linier.getB(b);
        
        System.out.println("Masukan nilai c: ");
        int c = input.nextInt();
        linier.getC(c);
        
        System.out.println("Masukan nilai d: ");
        int d = input.nextInt();
        linier.getD(d);
        
        System.out.println("Masukan nilai e: ");
        int e = input.nextInt();
        linier.getE(e);
        
        System.out.println("Masukan nilai f: ");
        int f = input.nextInt();
        linier.getF(f);
        
        if(linier.isSolvable() == true){
            int x = linier.getX();
            int y = linier.getY();
            
            hasil(a,b,c,d,e,f,x,y);
        } else {
            System.out.println("Persamaan tidak memiliki solusi");
        }
    }
    
    public static void hasil(int a, int b, int c, int d, int e, int f, int x, int y){
        int per1 = (a * x) + (b * y);
        int per2 = (c * x) + (d * y);
        
        System.out.println("ax + by = e");
        System.out.println("cx + dy = f");
        System.out.println("");
        System.out.println(a + "*" + x + "+" + b + "*" + y + "=" + e);
        System.out.println("Persamaan 1: " +per1);
        System.out.println("");
        System.out.println(c + "*" + x + "+" + d + "*" + y + "=" + f);
        System.out.println("Persamaan 2: " +per2);
    }
}
