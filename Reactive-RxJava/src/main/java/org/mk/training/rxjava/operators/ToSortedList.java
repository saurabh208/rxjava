package org.mk.training.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class ToSortedList {
    public static void main(String[] args) {
        Observable.just("Beta", "Gamma", "Alpha")
                .toSortedList()
                .subscribe(s -> System.out.println("Received: " + s));
    }
}