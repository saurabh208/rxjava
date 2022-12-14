package org.mk.training.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class TakeWhile {
    public static void main(String[] args) {
        Observable.range(1, 100)
                .takeWhile(i -> i < 5)
                .subscribe(i -> System.out.println("RECEIVED: " + i));
    }
}