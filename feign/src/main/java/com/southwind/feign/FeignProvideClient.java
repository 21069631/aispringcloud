package com.southwind.feign;

import com.southwind.enity.Student;
import com.southwind.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
@FeignClient(value="provider",fallback = FeignError.class)
public interface FeignProvideClient {
    @GetMapping("student/findAll")
    public Collection<Student>findAll();
    @GetMapping("student/index")
    public String index();
}
