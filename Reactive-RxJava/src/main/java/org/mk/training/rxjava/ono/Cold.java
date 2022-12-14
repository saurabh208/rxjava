package org.mk.training.rxjava.ono.ono;

import io.reactivex.rxjava3.core.Observable;

public class Cold {
    public static void main(String[] args) {
        Observable<String> source =
                Observable.just("Alpha", "Beta", "Gamma");
        //first observer
        source.subscribe(s -> System.out.println("Observer 1: " + s));
        //second observer
        source.subscribe(s -> System.out.println("Observer 2: " + s));
    }
}