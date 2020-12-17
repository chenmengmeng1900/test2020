package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * Created by ChenMeng on 2020/12/9 23:42
 */
public interface PaymentService {
    int create(Payment payment); //这里一般都是add,save,create,这里是写操作
    Payment getPaymentById(Integer id);
}
