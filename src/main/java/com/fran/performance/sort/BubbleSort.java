package com.fran.performance.sort;

import java.math.BigDecimal;

/**
 * Created by francisco on 3/10/16.
 */
public class BubbleSort {

    public static void main(String []args){
        if(args == null || args.length <= 0 ) return;

        BigDecimal [] listBigDecimal = new BigDecimal[Integer.parseInt(args[0])];
        for(int i = 0; i < listBigDecimal.length; i++){
            listBigDecimal[i] = new BigDecimal(Math.random() * Integer.parseInt(args[0]));
            System.out.println(listBigDecimal[i]);
        }
        BigDecimal[]listSorted = sortList(listBigDecimal);
        for(int i = 0; i< listSorted.length; i++){
            System.out.println(listSorted[i]);
        }

    }

    public static BigDecimal[] sortList(BigDecimal[] list){
        boolean isSorted;
        do{
            isSorted = true;
            for(int i = 0; i < list.length - 1; i++){
                if(list[i].compareTo(list[i+1]) > 0){
                    BigDecimal aux = list[i];
                    list[i] = list[i+1];
                    list[i+1] = aux;
                    isSorted = false;
                }
            }
        }while(!isSorted);
        return list;
    }
}
