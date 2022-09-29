/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mk.training.reactivestyle.rxjava.threads;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.*;

/**
 *
 * @author mohit
 */
public class ObserveOnThreads {

    public static void main(String... args) throws InterruptedException {
        System.out.println("------------------------------------------------");
        printThreadNames();

        System.out.println("------------------------------------------------");

    }

    public static void printThreadNames() throws InterruptedException {
        Observable.just("long", "longer", "longest")
                .doOnNext(c -> System.out.println("processing item on thread " + 
                        Thread.currentThread().getName()))
                .subscribeOn(Schedulers.newThread())
                .map(String::length)
                .observeOn(Schedulers.from(Executors.newFixedThreadPool(1)))
                .subscribe(length -> System.out.println("item length " 
                        + length + " received on thread " + Thread.currentThread().getName()));
        Thread.sleep(3000);
    }

}
