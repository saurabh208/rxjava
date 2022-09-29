package org.mk.training.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class DoOnEach {
    public static void main(String[] args) {
        Observable.just("One", "Two", "Three")
                .doOnEach(s -> System.out.println("doOnEach: " + s))
                .subscribe(i -> System.out.println("Received: " + i));
    }
}