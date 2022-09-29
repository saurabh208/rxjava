package org.mk.training.rxjava.stwb;

import io.reactivex.rxjava3.core.Observable;

public class Window {
    public static void main(String[] args) {
        Observable.range(1, 50)
                  .window(8)
                  .flatMapSingle(obs -> obs.reduce("",
                          (total, next) -> total + (total.equals("") ? "" : "|") + next))
                  .subscribe(System.out::println);
    }
}