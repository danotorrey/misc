package com.company;

public class Counter {

    public static final Integer MAX_COUNT = 10;

    private Integer count = 0;

    public Integer getCurrentCount() {

        return count;
    }

    public void increaseCount() {

        if ( count == MAX_COUNT ) {
            System.out.println( String.format( "Sorry, can't count that high. Max count is [%d]", MAX_COUNT ) );
            return;
        }

        count++;
    }
}