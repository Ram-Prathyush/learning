package com.ram;

public class Multipick {
    void print(){
        for(int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d", 5, i, 5*i).println();
        }
    }

    void print(int table, int from, int to){
        for(int i = from; i <= to; i++){
            System.out.printf("%d x %d = %d", table, i, table*i).println();
        }
    }
}
