package org.mk.training.rxjava.mrc;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;

public class Multicast2 {
    public static void main(String[] args) {
        ConnectableObservable<Integer> ints =
                Observable.range(1, 3).publish();
        ints.subscribe(i -> System.out.println("Observer One:" + i));
        ints.subscribe(i -> System.out.println("Observer Two:" + i));
        ints.connect();
    }
}