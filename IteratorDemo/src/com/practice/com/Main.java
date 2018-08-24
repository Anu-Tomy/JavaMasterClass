package com.practice.com;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        //create an arraylist
        ArrayList arrList = new ArrayList();
        //add elements to the list
        arrList.add("C");
        arrList.add("A");
        arrList.add("B");
        arrList.add("D");
        arrList.add("E");
        //System.out.println(arrList);

        // Use iterator to display contents of arrList
        System.out.println("Original elements are: ");
        Iterator itr = arrList.iterator();

        while(itr.hasNext()){
            Object element = itr.next();
            System.out.print(element + " ");
        }


    }
}
