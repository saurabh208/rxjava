package org.mk.training.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class ElementAt {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Zeta", "Eta", "Gamma")
                .elementAt(3)
                .subscribe(i -> System.out.println("RECEIVED: " + i));
    }
}