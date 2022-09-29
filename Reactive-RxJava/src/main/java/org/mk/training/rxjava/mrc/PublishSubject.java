package org.mk.training.rxjava.mrc;

import io.reactivex.rxjava3.subjects.Subject;

public class PublishSubject {
    public static void main(String[] args) {
        Subject<String> subject = io.reactivex.rxjava3.subjects.PublishSubject.create();
        subject.map(String::length)
               .subscribe(System.out::println);

        subject.onNext("Alpha");
        subject.onNext("Beta");
        subject.onNext("Gamma");
        subject.onComplete();
    }
}