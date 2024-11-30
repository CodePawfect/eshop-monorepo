package github.codepawfect.commonsecurity;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@AutoConfiguration
@RequiredArgsConstructor
@ComponentScan(basePackages = "github.codepawfect.commonsecurity")
public class JwtSecurityAutoConfiguration {

    private final JwtFilter jwtFilter;
}
