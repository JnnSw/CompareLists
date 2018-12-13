/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x.mavenproject4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author User
 */
public class Test {
     List<Integer> list;
    
    /**
     * Конструктор-создает ArrayList или LinkedList
     * заполняет единицами
     * @param size
     * @param x 
     */
    Test(int size, int x)
    {
        if (x==1){list = new ArrayList<>();}
        else {list =new LinkedList<>();}
        
        for(int i=0;i<size;i++)
        {
            list.add(1);
        }
    }
    
    
    /**
     * Проводит count тектов операции добавления
     * @param size
     * @param count
     * @param index
     * @return сумарное время, деленное на количество тестов
     */
    public double testAdd(int size, int count, int index) {
        long sum = 0;
        for (int i = 0; i < count; i++) {
            sum += testAddElement(size, index);
        }

        return sum / (double) count;
    }
    
    /**
     * Проводит count тектов операции удаления
     * @param size
     * @param count
     * @param index
     * @return сумарное время, деленное на количество тестов
     */
    public double testRemove(int size, int count,int index) {
        long sum = 0;
        for (int i = 0; i < count; i++) {
            sum += testRemoveElement(size, index);
        }

        return sum / (double) count;
    }


    /**
     * Проводит count тектов операции получения элемента по индексу
     * @param size
     * @param count
     * @param index
     * @return сумарное время, деленное на количество тестов
     */
    public double testGet(int size, int count,int index) {
        long sum = 0;
        for (int i = 0; i < count; i++) {
            sum += testGetElement(size, index);
        }

        return sum / (double) count;
    }




    /**
     * вычисляет время вполнения операции добавления
     * @param size
     * @param element
     * @return разницу во времени
     */
    public long testAddElement(int size, int element) {
        
        long start, end;
        start = System.currentTimeMillis();
        list.add(element, 1);
        end = System.currentTimeMillis();
       
        return start-end;
    }
    
    /**
     * вычисляет время вполнения операции удаления
     * @param size
     * @param element
     * @return разницу во времени
     */
    public long testRemoveElement(int size, int element) {

        long start, end;
        start = System.currentTimeMillis();
        list.remove(element);

        end = System.currentTimeMillis();
        return start-end;
    }

    
    /**
     * вычисляет время вполнения операции получения элемента по индексу
     * @param size
     * @param element
     * @return разницу во времени
     */
    public long testGetElement(int size, int element) {

        long start, end;
        start = System.currentTimeMillis();
        list.get(element);

        end = System.currentTimeMillis();
        return start-end;
    }
}
