package org.mk.training.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.CopyOnWriteArrayList;

public class ToList3 {
    public static void main(String[] args) {
        Observable.just("Beta", "Gamma", "Alpha")
                .toList(CopyOnWriteArrayList::new)
                .subscribe(s -> System.out.println("Received: " + s));
    }
}