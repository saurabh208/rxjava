package org.mk.training.rxjava.ono;

import io.reactivex.rxjava3.core.Observable;

public class Single2 {
    public static void main(String[] args) {
        Observable<String> source = Observable.just("Alpha", "Beta");
        source.first("Nil") //returns a Single
                .subscribe(System.out::println);
    }
}