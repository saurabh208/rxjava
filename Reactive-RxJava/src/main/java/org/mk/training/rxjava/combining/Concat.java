package org.mk.training.rxjava.combining;

import io.reactivex.rxjava3.core.Observable;

public class Concat {
    public static void main(String[] args) {
        Observable<String> src1 = Observable.just("Alpha", "Beta");
        Observable<String> src2 = Observable.just("Zeta", "Eta");
        Observable.concat(src1, src2)
                  .subscribe(i -> System.out.println("RECEIVED: " + i));
    }
}