package com.southwind.feign.impl;

import com.southwind.enity.Student;
import com.southwind.feign.FeignProvideClient;
import org.springframework.stereotype.Component;

import java.util.Collection;
@Component
public class FeignError implements FeignProvideClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中...";
    }
}
