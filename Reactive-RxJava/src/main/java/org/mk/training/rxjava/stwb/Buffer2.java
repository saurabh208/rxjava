package org.mk.training.rxjava.stwb;

import io.reactivex.rxjava3.core.Observable;
import java.util.HashSet;

public class Buffer2 {
    public static void main(String[] args) {
        Observable.range(1,50)
                  .buffer(8, HashSet::new)
                  .subscribe(System.out::println);
    }
}