/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mk.training.reactivestyle.rxjava.threads;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

/**
 *
 * @author mohit
 */
public class SubscribeOnThreads {

    public static void main(String... args) throws InterruptedException {
        System.out.println("------------------------------------------------");
        //printThreadNames();
        printThreadNames2();
        System.out.println("------------------------------------------------");
        
    }

    public static void printThreadNames() {
        Observable.just("long", "longer", "longest")
                .doOnNext(c -> System.out.println("processing item on thread " + Thread.currentThread().getName()))
                .subscribeOn(Schedulers.newThread())
                .map(String::length)
                .subscribe(length -> System.out.println("item length " + length+"received on " + Thread.currentThread().getName()));
    }
    
    public static void printThreadNames2() throws InterruptedException {
        Observable.just("long", "longer", "longest")
                .doOnNext(c -> System.out.println("processing item on thread " 
                        + Thread.currentThread().getName()))
                .subscribeOn(Schedulers.newThread())
                .map(String::length)
                .subscribe(length -> System.out.println("item length " 
                        + length+"received on " + Thread.currentThread().getName()));
        
        Thread.sleep(3000);
    }
}
