package com.queryexample.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.queryexample.filters.UppercaseQueryParamFilter;



@Configuration
public class WebConfig {

    @Bean
    public FilterRegistrationBean<UppercaseQueryParamFilter> uppercaseQueryParamFilter() {
        FilterRegistrationBean<UppercaseQueryParamFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new UppercaseQueryParamFilter());
        registrationBean.addUrlPatterns("/api/deskbook"); // You can adjust the URL pattern as needed
        return registrationBean;
    }
}
