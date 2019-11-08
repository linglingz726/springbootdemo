package com.offcn.springbootdemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/html")
public class WebMvcConfigurerController {
    @RequestMapping("/getHtml")
    public String toHtml() {
        return "/webjarsDemo.html";
    }

}
