package org.mk.training.rxjava.ono;

import io.reactivex.rxjava3.core.Observable;

public class Range {
    public static void main(String[] args) {
        Observable.range(5, 3)
                .subscribe(s -> System.out.println("RECEIVED: " + s));
    }
}