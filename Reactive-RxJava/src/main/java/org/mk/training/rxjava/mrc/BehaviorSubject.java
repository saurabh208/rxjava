package org.mk.training.rxjava.mrc;

import io.reactivex.rxjava3.subjects.Subject;

public class BehaviorSubject {
    public static void main(String[] args) {
        Subject<String> subject = io.reactivex.rxjava3.subjects.BehaviorSubject.create();
        subject.subscribe(s -> System.out.println("Observer 1: " + s));
        subject.onNext("Alpha");
        subject.onNext("Beta");
        subject.onNext("Gamma");
        subject.subscribe(s -> System.out.println("Observer 2: " + s));
    }
}