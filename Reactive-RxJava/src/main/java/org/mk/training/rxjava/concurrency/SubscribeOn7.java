package org.mk.training.rxjava.concurrency;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;

import java.net.URL;
import java.util.Scanner;

public class SubscribeOn7 {
    public static void main(String[] args) {
        String href = "https://api.github.com/users/slowbreathing";
        Observable.fromCallable(() -> getResponse(href))
                .subscribeOn(Schedulers.io())
                .subscribe(System.out::println);
        sleep(10000);
    }

    private static String getResponse(String path) {
        try {
            return new Scanner(new URL(path).openStream(),
                    "UTF-8").useDelimiter("\\A").next();
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    private static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}