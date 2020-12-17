package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentMapper;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ChenMeng on 2020/12/9 23:44
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentMapper paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }


    public Payment getPaymentById(Integer id){
        return paymentDao.getPaymentById(id);
    };


}
