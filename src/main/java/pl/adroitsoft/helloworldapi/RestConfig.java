package pl.adroitsoft.helloworldapi;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class RestConfig implements WebMvcConfigurer {

    @Bean
    LoggingFilter loggingFilter() {
        LoggingFilter loggingFilter = new LoggingFilter();
        loggingFilter.setIncludeHeaders(true);
        loggingFilter.setIncludeQueryString(true);
        loggingFilter.setIncludePayload(true);
        return loggingFilter;
    }
}
