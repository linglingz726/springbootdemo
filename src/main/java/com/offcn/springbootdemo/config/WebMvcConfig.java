package com.offcn.springbootdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
   /*
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        //将此路径【E:\picture】下所有的内容都映射到【/upload/**】路径下
        registry.addResourceHandler("/upload/**").addResourceLocations("file:E:\\picture\\");
    }
    */
   @Override
   public void addResourceHandlers(ResourceHandlerRegistry registry){
       //将此路径【classpath:/WETA-INF/resources/webjars/】下所有的内容都映射到【/webjars/**】路径下
       registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/WETA-INF/resources/webjars/");
   }
}
