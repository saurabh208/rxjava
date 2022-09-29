package org.mk.training.rxjava.ono;

public class Completable {
    public static void main(String[] args) {
        io.reactivex.rxjava3.core.Completable.fromRunnable(() -> runProcess())
                .subscribe(() -> System.out.println("Done!"));
    }

    private static void runProcess() {
       //run process here
    }
}