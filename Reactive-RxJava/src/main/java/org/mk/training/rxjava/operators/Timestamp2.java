package org.mk.training.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.TimeUnit;

public class Timestamp2 {
    public static void main(String[] args) {
        Observable.just("One", "Two", "Three")
                .timestamp(TimeUnit.SECONDS)
                .subscribe(i -> System.out.println("Received: " + i.time() + " " + i.unit() + " " + i.value()));
    }
}