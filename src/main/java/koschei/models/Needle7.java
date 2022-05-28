package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Needle7 {
    @Bean
    private Deth8 getDeth() {
        return new Deth8();
    }
    @Autowired


    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + getDeth().toString();
    }
}
