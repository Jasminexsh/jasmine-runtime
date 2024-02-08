package com.jasmine.runtime;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xieshanghan
 * @version JasmineRuntimeApplication.java v 0.1, 2024/2/5 xieshanghan
 */
@SpringBootApplication
@EnableDubbo
public class JasmineRuntimeApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(JasmineRuntimeApplication.class, args);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

}