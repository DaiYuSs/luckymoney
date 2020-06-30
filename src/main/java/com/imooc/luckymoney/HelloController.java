package com.imooc.luckymoney;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ljj
 * @version 1.0
 * @date 2020/6/30
 */
@RestController
public class HelloController {

    /**
     * /@RequestMapping(value = "/hello", method = RequestMethod.GET)是1.x的写法
     *
     * @return java.lang.String
     * @author ljj
     * @date 2020/6/30 15:48
     */
    @GetMapping
    public String say() {
        return "2小时上手springboot";
    }
}
