package com.imooc.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ljj
 * @version 1.0
 * @date 2020/7/1
 */
@Service
public class LuckymoneyService {

    @Autowired
    private LuckmoneyRepository repository;

    /**
     * @author ljj
     * @date 2020/7/1 16:15
     */
    @Transactional
    public void createTwo() {
        // 代码块
    }
}
