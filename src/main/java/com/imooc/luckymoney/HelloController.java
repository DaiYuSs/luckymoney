package com.imooc.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author ljj
 * @version 1.0
 * @date 2020/6/30
 */
@RestController
public class HelloController {
    @Autowired
    private LimitConfig limitConfig;


    /**
     * /@RequestMapping(value = "/hello", method = RequestMethod.GET)是1.x的写法
     *
     * @return java.lang.String
     * @author ljj
     * @date 2020/6/30 15:48
     */
    @GetMapping("hello")
    public String say() {
        return "2小时上手springboot??";
    }

    /**
     * @return java.lang.String
     * @author ljj
     * @date 2020/6/30 16:56
     */
    @GetMapping("money")
    public String sayMoney() {
        return "说明：" + limitConfig.getDescription();
    }
}
