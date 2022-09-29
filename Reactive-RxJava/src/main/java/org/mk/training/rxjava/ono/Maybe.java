package org.mk.training.rxjava.ono;

public class Maybe {
    public static void main(String[] args) {
        // has emission
        io.reactivex.rxjava3.core.Maybe<Integer> source = io.reactivex.rxjava3.core.Maybe.just(100);
        source.subscribe(s -> System.out.println("Process 1: " + s),
                e -> System.out.println("Error captured: " + e),
                () -> System.out.println("Process 1 done!"));
        //no emission
        io.reactivex.rxjava3.core.Maybe<Integer> empty = io.reactivex.rxjava3.core.Maybe.empty();
        empty.subscribe(s -> System.out.println("Process 2: " + s),
                e -> System.out.println("Error captured: " + e),
                () -> System.out.println("Process 2 done!"));
    }
}