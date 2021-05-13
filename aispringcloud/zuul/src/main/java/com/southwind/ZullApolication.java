package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @ClassName ZullApolication
 * @Description TODO
 * @Author admin
 * @Date 2021/5/11 14:19
 */
@EnableZuulProxy
@EnableAutoConfiguration
public class ZullApolication {
    public static void main(String[] args) {
        SpringApplication.run(ZullApolication.class, args);
    }
}
