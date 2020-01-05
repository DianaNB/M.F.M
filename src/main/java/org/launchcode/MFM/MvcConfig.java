package org.launchcode.MFM;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer{

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("/");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/register").setViewName("register");
        registry.addViewController("/profile").setViewName("profile");
        registry.addViewController("/playlist").setViewName("playlist");
        registry.addViewController("/search").setViewName("search");
        registry.addViewController("/").setViewName("logout");
    }

}
