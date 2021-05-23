package tr.ogr.mericisyar.trakya.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import tr.ogr.mericisyar.trakya.sfgdi.services.GreetingService;

@Controller
public class PropertyInjectedController {
    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    public GreetingService greetingService;


    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
