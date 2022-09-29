package org.mk.training.rxjava.mrc;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.Subject;

import java.util.concurrent.TimeUnit;

public class UnicastSubject {
    public static void main(String[] args) {
        Subject<String> subject = io.reactivex.rxjava3.subjects.UnicastSubject.create();
        Observable.interval(300, TimeUnit.MILLISECONDS)
                  .map(l -> ((l + 1) * 300) + " milliseconds")
                  .subscribe(subject);
        sleep(2000);
        subject.subscribe(s -> System.out.println("Observer 1: " + s));
        sleep(2000);
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}