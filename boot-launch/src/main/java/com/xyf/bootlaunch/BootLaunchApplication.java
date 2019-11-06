package com.xyf.bootlaunch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author : xuyunfeng
 * @date :   2019/11/4 15:50
 */
@SpringBootApplication
@ServletComponentScan
public class BootLaunchApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootLaunchApplication.class,args);
    }
}
