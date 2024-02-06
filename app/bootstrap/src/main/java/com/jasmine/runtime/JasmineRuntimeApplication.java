package com.jasmine.runtime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xieshanghan
 * @version JasmineRuntimeApplication.java v 0.1, 2024/2/5 xieshanghan
 */
@SpringBootApplication
public class JasmineRuntimeApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(JasmineRuntimeApplication.class, args);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

}