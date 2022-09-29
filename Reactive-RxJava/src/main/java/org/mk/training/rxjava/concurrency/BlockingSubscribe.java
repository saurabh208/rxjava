package org.mk.training.rxjava.concurrency;

import io.reactivex.rxjava3.schedulers.Schedulers;
import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.ThreadLocalRandom;

public class BlockingSubscribe {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                  .subscribeOn(Schedulers.computation())
                  .map(BlockingSubscribe::intenseCalculation)
                  .blockingSubscribe(System.out::println,
                        Throwable::printStackTrace,
                        () -> System.out.println("Done!"));
    }

    public static <T> T intenseCalculation(T value) {
        sleep(ThreadLocalRandom.current().nextInt(3000));
        return value;
    }

    private static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}