package by.it.academy.travelagency.configs;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties("services.registration")
public class CompanyProperties {

    private String companyName;

    private String officialStateRegistrationNumber;
}
