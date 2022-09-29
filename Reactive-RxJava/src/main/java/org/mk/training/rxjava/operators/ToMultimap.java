package org.mk.training.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class ToMultimap {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma")
                .toMultimap(String::length)
                .subscribe(s -> System.out.println("Received: " + s));
    }
}