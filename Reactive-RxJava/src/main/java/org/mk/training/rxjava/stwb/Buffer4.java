package org.mk.training.rxjava.stwb;

import io.reactivex.rxjava3.core.Observable;

public class Buffer4 {
    public static void main(String[] args) {
        Observable.range(1, 10)
                  .buffer(3, 1)
                  .subscribe(System.out::println);
    }
}