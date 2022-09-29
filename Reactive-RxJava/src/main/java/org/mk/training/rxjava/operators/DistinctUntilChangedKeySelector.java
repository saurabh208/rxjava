package org.mk.training.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class DistinctUntilChangedKeySelector {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Zeta", "Eta", "Gamma", "Delta")
                .distinctUntilChanged(String::length)
                .subscribe(i -> System.out.println("RECEIVED: " + i));
    }
}