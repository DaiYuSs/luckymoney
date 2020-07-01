package com.imooc.luckymoney;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ljj
 * @version 1.0
 * @date 2020/7/1
 */
public interface LuckmoneyRepository extends JpaRepository<Luckymoney, Integer> {
}
