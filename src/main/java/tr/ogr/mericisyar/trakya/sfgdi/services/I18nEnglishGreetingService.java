package tr.ogr.mericisyar.trakya.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nSerivce")
public class I18nEnglishGreetingService implements GreetingService{
    @Override
    public String sayGreeting(){
        return "Hello World";
    }
}
