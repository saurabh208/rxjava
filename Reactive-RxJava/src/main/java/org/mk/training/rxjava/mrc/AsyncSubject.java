package org.mk.training.rxjava.mrc;

import io.reactivex.rxjava3.subjects.Subject;

public class AsyncSubject {
    public static void main(String[] args) {
        Subject<String> subject = io.reactivex.rxjava3.subjects.AsyncSubject.create();
        subject.subscribe(s -> System.out.println("Observer 1: " + s),
                          Throwable::printStackTrace,
                          () -> System.out.println("Observer 1 done!")
        );
        subject.onNext("Alpha");
        subject.onNext("Beta");
        subject.onNext("Gamma");
        subject.onComplete();
        subject.subscribe(s -> System.out.println("Observer 2: " + s),
                          Throwable::printStackTrace,
                          () -> System.out.println("Observer 2 done!")
        );
    }
}