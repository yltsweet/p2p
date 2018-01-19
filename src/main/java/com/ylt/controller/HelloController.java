package com.ylt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2018/1/18.
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public ModelAndView getHello(){
        ModelAndView mv=new ModelAndView();
        mv.addObject("aa","hellosprfffingboot");
        mv.setViewName("hello");
        return mv;
    }
}
