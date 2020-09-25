package cn.hm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

//    @RequestMapping("home")
//    public String home(){
//        return "index";
//    }
//
//    @RequestMapping("/path/*")//返回以path开头的二级目录
//    public String path1(){
//        return "index";
//    }
//
//    @RequestMapping("/path/**")
//    public  String path2(){
//        return "index";
//    }

    @RequestMapping
    public  String path3(){
        return "index";
    }
}
