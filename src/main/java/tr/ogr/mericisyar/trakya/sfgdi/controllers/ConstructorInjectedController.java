package tr.ogr.mericisyar.trakya.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import tr.ogr.mericisyar.trakya.sfgdi.services.GreetingService;

@Controller
public class ConstructorInjectedController {


    private final GreetingService greetingService;

    public ConstructorInjectedController( @Qualifier("constructorInjectedGreetingService")
                                                  GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
