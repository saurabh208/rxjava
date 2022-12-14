package org.mk.training.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class Repeat {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma")
                .repeat(2)
                .subscribe(s -> System.out.println("Received: " + s));
    }
}