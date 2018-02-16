package com.company;

public class Main {

    public static void main( String[] args ) {

        Counter counterInstance = new Counter();

        for ( int i = 0; i < 12; i++ ) {
            counterInstance.increaseCount();
            System.out.println( String.format( "Count increased to [%d]", counterInstance.getCurrentCount() ) );
        }

        System.out.println( String.format( "The max count value is [%d] and is never changed on purpose.",
                                           Counter.MAX_COUNT ) );
    }
}
