package org.mk.training.rxjava.ono;

import io.reactivex.rxjava3.core.Observable;

class Defer2 {
    private static int start = 1;
    private static int count = 3;

    public static void main(String[] args) {
        Observable<Integer> source = Observable.defer(() ->
                Observable.range(start, count));
        source.subscribe(i -> System.out.println("Observer 1: " + i));
        //modify count
        count = 5;
        source.subscribe(i -> System.out.println("Observer 2: " + i));
    }
}