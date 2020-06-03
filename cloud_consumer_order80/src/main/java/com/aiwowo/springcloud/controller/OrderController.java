package com.aiwowo.springcloud.controller;

import com.aiwowo.springcloud.entity.CommonResult;
import com.aiwowo.springcloud.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@Controller
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;

    public static final String URL = "http://CLOUD-PAYMENT-SERVICE";

    @GetMapping("/consumer/get/{id}")
    @ResponseBody
    public CommonResult<Payment> getPayment(@PathVariable("id")int id){
        CommonResult commonResult=restTemplate.getForObject(URL+"/payment/get/"+id,CommonResult.class);
        return commonResult;
    }

    @PostMapping("/consumer/create")
    @ResponseBody
    public CommonResult createPayment(@RequestBody Payment payment){
        CommonResult commonResult = restTemplate.postForObject(URL+"/payment/create",payment,CommonResult.class);
        return commonResult;
    }
}
