package tr.ogr.mericisyar.trakya.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting(){
        return "Hello From PropertyInjected Greeting Service";
    }
}
