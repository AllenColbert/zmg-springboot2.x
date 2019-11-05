package com.xyf.bootlaunch.config;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Dozer构造类
 * 装配Dozer对象 mapper 的 bean;
 */
@Configuration
public class DozerBeanMapperConfigure {
    @Bean
    public DozerBeanMapper mapper() {
        return new DozerBeanMapper();
    }
}
