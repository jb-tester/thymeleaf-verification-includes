package com.mytests.spring.thymeleaf.thymeleaf_verification1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * *
 * <p>Created by irina on 26.01.2022.</p>
 * <p>Project: thymeleaf-verification-includes</p>
 * *
 */
@Controller
public class EnumsController {
    @Value("#{T(com.mytests.spring.thymeleaf.thymeleaf_verification1.SomeClass$InnerEnum).FOO.getValue()}")
    String str1;
    @Value("#{T(com.mytests.spring.thymeleaf.thymeleaf_verification1.SomeClass.InnerEnum).FOO.getValue()}")
    String str2;
    @RequestMapping("/enum_test")
    public String enum_test(ModelMap model) {
        model.addAttribute("enum_test_attr1", str1);
        model.addAttribute("enum_test_attr2", str2);
        model.addAttribute("color", Color.GREEN);
        return "enum_test";
    }
}
