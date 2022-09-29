package org.mk.training.rxjava.mrc;

import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.Subject;

public class PublishSubject3 {
    public static void main(String[] args) {
        Subject<String> subject = PublishSubject.create();
        subject.onNext("Alpha");
        subject.onNext("Beta");
        subject.onNext("Gamma");
        subject.onComplete();
        subject.map(String::length)
                .subscribe(System.out::println);

    }
}