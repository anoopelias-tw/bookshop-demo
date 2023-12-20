package fun.bookshop;

import org.jose4j.jwt.consumer.JwtConsumerBuilder;
import org.springframework.stereotype.Component;

@Component
public class JwtConsumerBuilderWrapper {

    private JwtConsumerBuilder jwtConsumerBuilder;

    public JwtConsumerBuilderWrapper() {
        jwtConsumerBuilder = new JwtConsumerBuilder();
    }

    public JwtConsumerBuilder getJwtConsumerBuilder() {
        return jwtConsumerBuilder;
    }
}
