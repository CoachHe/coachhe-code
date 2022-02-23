package com.coachhe.springcloud.controller;

import com.coachhe.springcloud.entities.CommonResult;
import com.coachhe.springcloud.entities.Payment;
import com.coachhe.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(Payment payment) {
        int result = paymentService.create(payment);
        log.info("*******插入结果： " + result);

        if (result > 0) {
            return new CommonResult(200, "插入数据库成功", "success");
        } else {
            return new CommonResult(444, "插入数据库失败", null);
        }

    }

    @PostMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("*******插入结果： " + payment);

        if (payment != null) {
            return new CommonResult(200, "查询数据库成功", payment);
        } else {
            return new CommonResult(444, "没有对应记录，查询ID: " + id, null);
        }
    }


}
