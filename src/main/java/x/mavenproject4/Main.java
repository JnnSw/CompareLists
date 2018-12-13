/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x.mavenproject4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("1 -  Add");
        System.out.println("2 -  Remove");
        System.out.println("3 -  Get");
        int x=0;
        while (x>3 | x<1)
        {x=in.nextInt();}
        
        
        int count=0,size=0;
        System.out.print("size=");
        size=in.nextInt();
        System.out.print("count=");
        count=in.nextInt();
        Difference prog= new Difference();
        prog.testD(x, size, count);
        
        
    }
}
