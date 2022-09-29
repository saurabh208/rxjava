package org.mk.training.reactivestyle.reallysimple;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;
import java.util.function.Consumer;

    public class PublisherCell implements Publisher<Integer> {

        private int value = 0;
        private String name;
    private List<Subscriber<? super Integer>> subscribers = new ArrayList<>();

    public static void main(String[] args) {
        SubscriberCell c3 = new SubscriberCell("C3");
        SubscriberCell c2 = new SubscriberCell("C2");
        PublisherCell c1 = new PublisherCell("C1");

        c1.subscribe(c3);

        c1.publish(10); // Update value of C1 to 10
        c2.onNext(20); // update value of C2 to 20

    }

    public PublisherCell(String name) {
        this.name = name;
    }

    @Override
    public void subscribe(Subscriber<? super Integer> subscriber) {
        subscribers.add(subscriber);
    }

    /*
    *Lamdas only work on functional interface
    */
    public void subscribe(Consumer<? super Integer> onNext) {
        subscribe(new Subscriber<>() {

            @Override
            public void onComplete() {
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onNext(Integer val) {
                onNext.accept(val);
            }

            @Override
            public void onSubscribe(Subscription s) {
            }

        });
    }

    private void notifyAllSubscribers() {
        subscribers.forEach(subscriber -> subscriber.onNext(value));
    }

    public void publish(Integer newValue) {
        value = newValue;
        System.out.println(name + ":" + value);
        notifyAllSubscribers();
    }

}
