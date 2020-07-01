package com.imooc.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

/**
 * @author ljj
 * @version 1.0
 * @date 2020/7/1
 */
@RestController
public class LuckymoneyController {

    @Autowired
    private LuckmoneyRepository repository;

    @Autowired
    private LuckymoneyService service;

    /**
     * 获取红包列表
     *
     * @return java.util.List<com.imooc.luckymoney.Luckymoney>
     * @author ljj
     * @date 2020/7/1 14:10
     */
    @GetMapping("/luckymoneys")
    public List<Luckymoney> list() {
        return repository.findAll();
    }

    /**
     * 创建红包(发红包)
     *
     * @param producer 发起人
     * @param money    红包量
     * @return com.imooc.luckymoney.Luckymoney
     * @author ljj
     * @date 2020/7/1 14:23
     */
    @PostMapping("/luckymoneys")
    public Luckymoney create(@RequestParam("producer") String producer, @RequestParam("money") BigDecimal money) {
        Luckymoney luckymoney = new Luckymoney();
        luckymoney.setProducer(producer);
        luckymoney.setMoney(money);
        return repository.save(luckymoney);
    }

    /**
     * 通过id查询
     *
     * @param id 主键id
     * @return com.imooc.luckymoney.Luckymoney
     * @author ljj
     * @date 2020/7/1 15:28
     */
    @GetMapping("/luckymoneys/{id}")
    public Luckymoney findById(@PathVariable("id") Integer id) {
        return repository.findById(id).orElse(null);
    }

    /**
     * 更新红包接收人
     *
     * @param id       主键id
     * @param consumer 接收人名称
     * @return com.imooc.luckymoney.Luckymoney
     * @author ljj
     * @date 2020/7/1 15:35
     */
    @PutMapping("/luckymoneys/{id}")
    public Luckymoney update(@PathVariable("id") Integer id, @RequestParam("consumer") String consumer) {
        Optional<Luckymoney> optional = repository.findById(id);
        if (optional.isPresent()) {
            Luckymoney luckymoney = optional.get();
            luckymoney.setConsumer(consumer);
            return repository.save(luckymoney);
        }

        return null;
    }

    /**
     * @author ljj
     * @date 2020/7/1 16:08
     */
    @PostMapping("/luckymoneys/two")
    public void create() {
        service.createTwo();
    }
}
