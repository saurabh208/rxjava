package org.mk.training.rxjava.concurrency;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;

import java.util.concurrent.TimeUnit;

public class SubscribeOn8 {
    public static void main(String[] args) {
        Observable.interval(1, TimeUnit.SECONDS)
                  .subscribeOn(Schedulers.newThread())
                  .subscribe(i -> System.out.println("Received " + i +
                        " on thread " + Thread.currentThread().getName()));
        sleep(5000);
    }

    private static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}