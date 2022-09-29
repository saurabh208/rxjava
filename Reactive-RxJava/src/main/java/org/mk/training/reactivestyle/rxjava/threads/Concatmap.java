/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mk.training.reactivestyle.rxjava.threads;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import java.util.Random;

/**
 *
 * @author mohit
 */
public class Concatmap {

    public static void main(String[] args) throws InterruptedException {
        Observable.just("long", "longer", "longest")
                .concatMap(v
                        -> performLongOperation(v)
                        .doOnNext(s -> System.out.println("processing "+s +" on thread " + Thread.currentThread().getName()))
                        .subscribeOn(Schedulers.newThread()))
                .subscribe(length -> System.out.println("received item length " + length + " on thread " + Thread.currentThread().getName()));

        Thread.sleep(10000);
    }

    /**
     * Returns length of each param wrapped into an Observable.
     */
    protected static Observable<Integer> performLongOperation(String v) {
        Random random = new Random();
        try {
            Thread.sleep(random.nextInt(3) * 1000);
            return Observable.just(v.length());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
