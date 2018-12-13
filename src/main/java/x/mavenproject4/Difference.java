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
public class Difference {
     double difference;
    
    Difference()
    {difference=0;}
    
    /**
     * 
     * @param number выбор операции (места в массиве)
     * @return 
     */
    int getf(int number)
    {
        Scanner inn = new Scanner(System.in);
          switch (number)
        {
            case 1:
                System.out.println("Add:");
                break;
            case 2:
                System.out.println("Remove:");
                break;
            case 3:
                System.out.println("Get:");
                break;
        }
        if(number==1 | number==2)
        {
          System.out.println("1 - Begin");
          System.out.println("2 - Middle");
          System.out.println("3 - End");
        }
        
        int y=0;
        y=inn.nextInt();
        return y;
    }
    /**
     * Запускает тест выбранной операции для Arraylist и LinkedList
     * Возвращает разность во времени
     * @param number
     * @param size
     * @param count 
     */
    void testD (int number,int size,int count)
    {

        Test t=new Test(size,1);
        double difference=0;
        switch (number)
        {case 1:
            switch (getf(number))
            {
                case 1:difference=t.testAdd(size, count,0);
                       t=new Test(size,2);
                       difference-=t.testAdd(size, count,0);
                       break;
                case 2:difference=t.testAdd(size, count,size / 2);
                       t=new Test(size,2);
                       difference-=t.testAdd(size, count,size / 2);
                       break;
                case 3:difference=t.testAdd(size, count,size - 1);
                       t=new Test(size,2);
                       difference-=t.testAdd(size, count,size - 1);
                       break;
            }
            break;
            
        case 2:
            switch (getf(number))
            {
                case 1:difference=t.testRemove(size, count,0);
                       t=new Test(size,2);
                       difference-=t.testRemove(size, count,0);
                       break;
                case 2:difference=t.testRemove(size, count,size / 2);
                       t=new Test(size,2);
                       difference-=t.testRemove(size, count,size / 2);
                       break;
                case 3:difference=t.testRemove(size, count,size - 1);
                       t=new Test(size,2);
                       difference-=t.testRemove(size, count,size - 1);
                       break;
            }
            break;
        case 3:
 
            int index=size+1;
            while(index>=size)
            {index=getf(number);}
            difference=t.testGet(size, count,index);
            t=new Test(size,2);
            difference-=t.testGet(size, count,index);
            break;

           
        }
        System.out.println("diff="+difference);
    }
}
