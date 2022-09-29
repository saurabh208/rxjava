package org.mk.training.rxjava.ono;

public class Single {
    public static void main(String[] args) {
        io.reactivex.rxjava3.core.Single.just("Hello!")
                .map(String::length)
                .subscribe(System.out::println,
                        e -> System.out.println("Error captured: " + e));
    }
}