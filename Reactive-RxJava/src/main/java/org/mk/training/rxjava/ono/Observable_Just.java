package org.mk.training.rxjava.ono.ono;

import io.reactivex.rxjava3.core.Observable;

public class Observable_Just {
    public static void main(String[] args) {
        Observable<String> source =
                Observable.just("Alpha", "Beta", "Gamma");
        source.map(String::length)
                .filter(i -> i >= 5)
              .subscribe(s -> System.out.println("RECEIVED: " + s));
    }
}