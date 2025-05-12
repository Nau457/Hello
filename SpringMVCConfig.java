package com.adv.connfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
@ComponentScan("com.*")
public class SpringMVCConfig  extends WebMvcConfigurationSupport
{

}
