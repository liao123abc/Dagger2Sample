package com.example.dagger;

import dagger.Component;
import javax.inject.Singleton;

public class CoffeeApp {
  @Singleton
  @Component(modules = { DripCoffeeModule.class })
  public interface Coffee {
    CoffeeMaker maker();
  }

  public static void test() {
    Coffee coffee = DaggerCoffeeApp_Coffee.builder().build();
    coffee.maker().brew();
  }
}
