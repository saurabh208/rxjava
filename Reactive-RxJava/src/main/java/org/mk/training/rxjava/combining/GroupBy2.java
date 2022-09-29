package org.mk.training.rxjava.combining;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.GroupedObservable;

public class GroupBy2 {
    public static void main(String[] args) {
        Observable<String> source =
                Observable.just("Alpha", "Beta", "Gamma", "Delta",
                        "Epsilon");
        Observable<GroupedObservable<Integer, String>> byLengths =
                source.groupBy(s -> s.length());
        byLengths.flatMapSingle(grp -> grp.toList())
                .subscribe(System.out::println);
    }
}