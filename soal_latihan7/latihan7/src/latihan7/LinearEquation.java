/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan7;

/**
 *
 * @author Yohanda Gita Pratiwi
 */
public class LinearEquation {
    private int a, b, c, d, e, f;
    
    LinearEquation(){
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        f = 0;
    }
    
    public int getA(int nilaiA){
        a = nilaiA;
        return a;
    }
    
    public int getB(int nilaiB){
        b = nilaiB;
        return b;
    }
    
    public int getC(int nilaiC){
        c = nilaiC;
        return c;
    }
    
    public int getD(int nilaiD){
        d = nilaiD;
        return d;
    }
    
    public int getE(int nilaiE){
        e = nilaiE;
        return e;
    }
    
    public int getF(int nilaiF){
        f = nilaiF;
        return f;
    }
    
    public boolean isSolvable(){
        boolean solve = false;
    
            if((a * d) - (b * c) !=0){
            solve = true;
            }
        return solve;    
    }
    
    public int getX(){
        int x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        return x;
    }
    
    public int getY(){
        int y = ((a * f) - (e * c)) / ((a * d) - (b * c));
        return y;
    }
    
    
}
