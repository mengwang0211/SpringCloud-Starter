package io.github.wangmeng.provider.rest;

import io.github.wangmeng.common.api.ApiResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "test")
public class ApiTestController {

    @GetMapping
    @ResponseBody
    public ApiResponseEntity test(){
        return ApiResponseEntity.ok("Welcome to New York");
    }

}
