package org.mk.training.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class Delay {
    public static void main(String[] args) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM:ss");
        System.out.println(LocalDateTime.now().format(f));
        Observable.just("Alpha", "Beta", "Gamma")
                .delay(3, TimeUnit.SECONDS)
                .subscribe(s -> System.out.println(LocalDateTime.now().format(f) + " Received: " + s));
        sleep(5000);
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}