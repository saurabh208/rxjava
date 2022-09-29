package org.mk.training.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class DoOnSuccess {
    public static void main(String[] args) {
        Observable.just(5, 3, 7)
                .reduce((total, next) -> total + next)
                .doOnSuccess(i -> System.out.println("Emitting: " + i))
                .subscribe(i -> System.out.println("Received: " + i));
    }
}