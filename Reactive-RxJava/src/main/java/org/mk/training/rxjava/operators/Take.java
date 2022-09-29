package org.mk.training.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class Take {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma")
                .take(2)
                .subscribe(s -> System.out.println("RECEIVED: " + s));
    }
}