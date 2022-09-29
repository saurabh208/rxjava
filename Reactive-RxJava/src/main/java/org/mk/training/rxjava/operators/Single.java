package org.mk.training.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class Single {
    public static void main(String[] args) {
        Observable.just("One")
                .single("Four")
                .subscribe(i -> System.out.println("Received: " + i));
    }
}
