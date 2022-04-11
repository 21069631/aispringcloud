package com.southwind;

import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import org.hibernate.validator.internal.constraintvalidators.bv.number.sign.PositiveValidatorForShort;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class,args);
    }
}
