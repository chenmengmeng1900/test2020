package com.atguigu.springcloud.controller;

/**
 * Created by ChenMeng on 2020/12/9 23:55
 */

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(Payment payment) {
        int result = paymentService.create(payment);
        log.info("****插入结果："+result);

        if(result>0)
        {
            return new CommonResult(200,"插入数据库成功",result);
        }else {
            return new CommonResult(404,"数据库插入失败",result);
        }
    }

    @RequestMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Integer id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("****插入结果："+ payment);

        if(payment != null)
        {
            return new CommonResult(200,"查询成功",payment);
        }else {
            return new CommonResult(404,"查询失败，查询的id:"+id,null);
        }
    }

}
