package com.mytests.spring.thymeleaf.thymeleaf_verification1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 ********************************
 * Created by Irina.Petrovskaya on 1/14/2019.
 * Project: thymeleaf-verification1
 * *******************************
 */
@Controller
@SessionAttributes("navigate_attr1")
public class MyController {

    @ModelAttribute("myurl")
    public String myurl(){
        return "";
    }
    @RequestMapping("/")
    public String home(ModelMap model) {
        List<MyData> mylist = new ArrayList<>();
        mylist.add(new MyData("masha",18,"spb"));
        mylist.add(new MyData("misha",18,"spb"));
        mylist.add(new MyData("dasha",18,"moscow"));
        mylist.add(new MyData("pasha",18,"moscow"));
        model.addAttribute("mylist", mylist);
        model.addAttribute("userName", "Irina");
        model.addAttribute("home_attr1", "day");
        model.addAttribute("home_attr2", "hello!");
        model.addAttribute("home_attr3", "bye-bye!");
        model.addAttribute("home_attr4", "**************");
        return "home";
    }

    @RequestMapping("/example")
    public String example(ModelMap model, @ModelAttribute("navigate_attr1") String na) {
        MyData mydata = new MyData("vasya",18,"spb" );
        model.addAttribute("mydata", mydata);
        model.addAttribute("myattr",na);
        return "example";
    }

    @RequestMapping("/navigate")
    public String navigate(@RequestParam("ex") String ex, ModelMap model) {
        model.addAttribute("navigate_attr1", ex);
        return "redirect:/example";
    }
    @RequestMapping("/goto/{pathvar}")
    public String gotoTest(ModelMap model, @PathVariable String pathvar) {
        model.addAttribute("pathvar", pathvar);
        return "redirect:/example";
    }
}
