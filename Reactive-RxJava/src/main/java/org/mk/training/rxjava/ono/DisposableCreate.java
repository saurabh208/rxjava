package org.mk.training.rxjava.ono;

import io.reactivex.rxjava3.core.Observable;

public class DisposableCreate {
    public static void main(String[] args) {
        Observable<Integer> source =
            Observable.create(observableEmitter -> {
                try {
                    for (int i = 0; i < 1000; i++) {
                        if (!observableEmitter.isDisposed()) {
                            observableEmitter.onNext(i);
                        }
                        if (observableEmitter.isDisposed()) {
                            return;
                        }
                    }
                    observableEmitter.onComplete();
                } catch (Throwable e) {
                    observableEmitter.onError(e);
                }
            });
        source.subscribe(i -> System.out.println(i)); //prints: 0 ... 999
    }
}