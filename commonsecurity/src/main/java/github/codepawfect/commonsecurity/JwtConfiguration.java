package github.codepawfect.commonsecurity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

@Configuration
public class JwtConfiguration {

    @Value("${jwt.secret.key}")
    private String secretKey;

    @Bean
    public SecretKey secretKey() {
        return new SecretKeySpec(secretKey.getBytes(), "RS256");
    }
}