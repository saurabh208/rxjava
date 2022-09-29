package org.mk.training.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class DoOnDispose {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma")
                .doOnSubscribe(d -> System.out.println("Subscribing!"))
                .doOnDispose(() -> System.out.println("Disposing!"))
                .subscribe(i -> System.out.println("RECEIVED: " + i));
    }
}