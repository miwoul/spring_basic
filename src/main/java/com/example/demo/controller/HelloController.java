package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
//http://localhost:8080/hello 요청시 hello 메서드에서 처리
//http 는 국제 통신 프로토콜
//https 는 보안이 강화된 (s-secure) 통신 프로토콜
//port 란 한 아이피 내에 여러 프로그램을 구분짓는 단위

    @GetMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello world";
    }
    //jsp/thymeleaf 같은 템플릿 엔진을 사용하여 화면을 return할 때는 responsebody를 사용하면 안된다.
    //model이라는 객체에 doto만을 return xxx를 하여 xxx.html파일로 데이터를 보낸다
    @GetMapping("hello-thymeleaf")
    public String hello2(Model model){
        model.addAttribute("getdata", "hello2 would");
        return "hello";
    }
}
