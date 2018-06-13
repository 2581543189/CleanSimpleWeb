package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ha")
public class TestController {

    @RequestMapping(value = "hi")
    @ResponseBody
    public String upload() {
        try{
            //dosomething
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }

        return "success";
    }
}
