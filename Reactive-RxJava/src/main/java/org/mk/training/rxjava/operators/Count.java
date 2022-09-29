package org.mk.training.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class Count {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma")
                .count()
                .subscribe(s -> System.out.println("Received: " + s));
    }
}