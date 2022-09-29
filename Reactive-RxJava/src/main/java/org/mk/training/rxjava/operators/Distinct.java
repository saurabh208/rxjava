package org.mk.training.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class Distinct {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma")
                .map(String::length)
                .distinct()
                .subscribe(i -> System.out.println("RECEIVED: " + i));
    }
}