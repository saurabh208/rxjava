package org.mk.training.rxjava.combining;

import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.TimeUnit;

public class Flatmap3 {
    public static void main(String[] args) {
        Observable.just(2, 3, 10, 7)
                .flatMap(i -> Observable.interval(i, TimeUnit.SECONDS)
                          .map(i2 -> i + "s interval: " + ((i2 + 1) * i) + " seconds elapsed"))
                .subscribe(System.out::println);
        sleep(12000);
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}