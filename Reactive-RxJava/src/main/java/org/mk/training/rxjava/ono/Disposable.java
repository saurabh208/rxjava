package org.mk.training.rxjava.ono;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class Disposable {
    public static void main(String[] args) {
        Observable<Long> seconds =
                Observable.interval(1, TimeUnit.SECONDS);
        io.reactivex.rxjava3.disposables.Disposable disposable =
                seconds.subscribe(l -> System.out.println("Received: " + l));
        //sleep 5 seconds
        sleep(5000);
        //dispose and stop emissions
        disposable.dispose();
        //sleep 5 seconds to prove
        //there are no more emissions
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