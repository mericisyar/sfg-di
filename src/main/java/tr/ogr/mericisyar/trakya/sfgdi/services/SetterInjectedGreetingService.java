package tr.ogr.mericisyar.trakya.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting(){
        return "Hello from Setter Injected Greeting Service";
    }
}
