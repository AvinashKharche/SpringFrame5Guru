package guru.springframework.didemo.controller;

import guru.springframework.didemo.services.GreetingServiceImpl;
/*

Not to do like this
 */
public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }

}
