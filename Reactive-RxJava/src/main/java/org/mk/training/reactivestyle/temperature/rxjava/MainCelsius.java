package org.mk.training.reactivestyle.temperature.rxjava;


import io.reactivex.Observable;
import static org.mk.training.reactivestyle.temperature.rxjava.TempObservable.getCelsiusTemperatures;
import org.mk.training.reactivestyle.temperature.TempInfo;

public class MainCelsius {

  public static void main(String[] args) {
    Observable<TempInfo> observable = getCelsiusTemperatures("New York", "Chicago", "San Francisco");
    observable.subscribe(new TempObserver());

    try {
      Thread.sleep(10000L);
    }
    catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

}
