package org.mk.training.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class ToMap2 {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma")
                .toMap(s -> s.charAt(0), String::length)
                .subscribe(s -> System.out.println("Received: " + s));
    }
}