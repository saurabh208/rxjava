package org.mk.training.reactivestyle.temperature;

import java.util.concurrent.Flow;
import java.util.concurrent.Flow.Publisher;

public class MainCelsius {

  public static void main(String[] args) {
    getCelsiusTemperatures("New York").subscribe(new TempSubscriber());
  }

  public static Publisher<TempInfo> getCelsiusTemperatures(String town) {
     //subscriber.
    return subscriber -> {
        //subscriber.
      TempProcessor processor = new TempProcessor();
      processor.subscribe(subscriber);
      processor.onSubscribe(new TempSubscription(processor, town));
    };
  }

}
