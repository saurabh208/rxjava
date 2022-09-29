package org.mk.training.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class DistinctKeySelector {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma")
                .distinct(String::length)
                .subscribe(i -> System.out.println("RECEIVED: " + i));
    }
}