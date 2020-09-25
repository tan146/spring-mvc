package cn.hm.controller;

import com.sun.deploy.net.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
/**
 * @author tan
 */
public class AnotherController {
    @GetMapping
    public String param(HttpServletRequest request){
        String name = request.getParameter("name");
        return "index";
    }
}
