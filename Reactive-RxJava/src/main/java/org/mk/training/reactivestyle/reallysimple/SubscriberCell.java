package org.mk.training.reactivestyle.reallysimple;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;
import java.util.function.Consumer;

    public class SubscriberCell implements Subscriber<Integer> {

        private int value = 0;
        private String name;
    private List<Subscriber<? super Integer>> subscribers = new ArrayList<>();


    public SubscriberCell(String name) {
        this.name = name;
    }

    @Override
    public void onNext(Integer newValue) {
        value = newValue;
        System.out.println(name + ":" + value);
    }

    @Override
    public void onComplete() {
    }

    @Override
    public void onError(Throwable t) {
        t.printStackTrace();
    }

    @Override
    public void onSubscribe(Subscription s) {
    }

}
