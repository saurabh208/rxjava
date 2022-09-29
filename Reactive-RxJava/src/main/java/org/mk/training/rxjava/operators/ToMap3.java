package org.mk.training.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.ConcurrentHashMap;

public class ToMap3 {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma")
                .toMap(s -> s.charAt(0), String::length,
                        ConcurrentHashMap::new)
                .subscribe(s -> System.out.println("Received: " + s));
    }
}