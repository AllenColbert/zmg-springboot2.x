package com.xyf.bootlaunch.config;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : xuyunfeng
 * @date :   2019/11/5 9:15
 */
@Configuration
public class DozerBeanMapperConfigure {
    @Bean
    public DozerBeanMapper mapper(){
        return new DozerBeanMapper();
    }
}
