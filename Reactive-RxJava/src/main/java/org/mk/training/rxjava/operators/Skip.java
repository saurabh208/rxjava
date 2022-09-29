package org.mk.training.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class Skip {
    public static void main(String[] args) {
        Observable.range(1, 100)
                .skip(90)
                .subscribe(i -> System.out.println("RECEIVED: " + i));
    }
}