package com.ksabu.project1;

import java.util.ArrayList;
import java.util.HashMap;

public class HelloWorld {

    public static final int NUM = 18;
    /**
     *
     *
     */

     private int num = 12;
        

    /**
     *
     */
     private String str1;
     
    // 第一个hello程序
    public static void main(String[] args) {
        System.out.println("HelloWorld");
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        if (list == null) {

            
        }

        for (Object o : list) {
            System.out.println("o = " + o);
        }
        for (int i = 0; i < list.size(); i++) {
            
        }
        HashMap<String, Object> map = new HashMap<String, Object>();
        
        HelloWorld.getName();

    }

    // 获取名字的方法
    public static void getName(){
        int[] str = new int[]{1, 2, 3, 4};
        for (int i = 0; i < str.length; i++) {
            System.out.println("i = " + i);
            System.out.println("i = " + i + 1);
        }
    }
}
