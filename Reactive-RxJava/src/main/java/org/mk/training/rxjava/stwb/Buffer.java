package org.mk.training.rxjava.stwb;

import io.reactivex.rxjava3.core.Observable;

public class Buffer {
    public static void main(String[] args) {
        Observable.range(1, 50)
                  .buffer(8)
                  .subscribe(System.out::println);
    }
}