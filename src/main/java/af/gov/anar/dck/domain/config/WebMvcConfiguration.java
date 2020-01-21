package af.gov.anar.dck.domain.config;

//import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties.LocaleResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebMvcConfiguration implements WebMvcConfigurer {

    // @Override
    // public void addViewControllers(ViewControllerRegistry registry) {
    //     registry.addViewController("/login").setViewName("login");
    //     registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    // }

    // @Override
    // public void addInterceptors(InterceptorRegistry registry) {
    //     LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
    //     localeChangeInterceptor.setParamName("lang");
    //     registry.addInterceptor(localeChangeInterceptor);
    // }

    // @Bean
    // public LocaleResolver localeResolver() {
    //     CookieLocaleResolver cookieLocaleResolver = new CookieLocaleResolver();
    //     return cookieLocaleResolver;
    // }

    // @Bean
    // public MessageSource messageSource() {
    //     ReloadableResourceBundleMessageSource messageSource
    //             = new ReloadableResourceBundleMessageSource();
    //     messageSource.setBasename("classpath:messages");
    //     messageSource.setUseCodeAsDefaultMessage(true);
    //     messageSource.setDefaultEncoding("UTF-8");
    //     messageSource.setCacheSeconds(0);
    //     return messageSource;
    // }

}
