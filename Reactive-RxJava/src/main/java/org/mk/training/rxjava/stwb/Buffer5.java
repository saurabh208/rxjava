package org.mk.training.rxjava.stwb;

import io.reactivex.rxjava3.core.Observable;

public class Buffer5 {
    public static void main(String[] args) {
        Observable.range(1, 10)
                  .buffer(2, 1)
                  .filter(c -> c.size() == 2)
                  .subscribe(System.out::println);
    }
}