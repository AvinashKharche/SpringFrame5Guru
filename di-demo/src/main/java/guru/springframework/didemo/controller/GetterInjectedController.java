package guru.springframework.didemo.controller;

import guru.springframework.didemo.services.GreetingService;

public class GetterInjectedController {
    private GreetingService greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }
}