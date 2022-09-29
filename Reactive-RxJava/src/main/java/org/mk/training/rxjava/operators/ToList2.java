package org.mk.training.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class ToList2 {
    public static void main(String[] args) {
        Observable.range(1, 1000)
                .toList(1000)
                .subscribe(s -> System.out.println("Received: " + s));
    }
}