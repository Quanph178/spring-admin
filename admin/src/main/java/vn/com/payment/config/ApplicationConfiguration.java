package vn.com.payment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import vn.com.payment.util.RestClient;

import java.net.http.HttpClient;

@Configuration
public class ApplicationConfiguration {
    @Bean
    public RestClient restClient() {
        return new RestClient(HttpClient.newHttpClient());
    }
}
