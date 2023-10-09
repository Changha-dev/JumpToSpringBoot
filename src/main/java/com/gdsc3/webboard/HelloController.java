package com.gdsc3.webboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
@Controller
public class HelloController {

    @RequestMapping(value = "hello", method = RequestMethod.GET)
//    @ResponseBody
    public String hello(){
        return "hello!!!";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }

}
