package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentMapper {
     int create(Payment payment); //这里一般都是add,save,create,这里是写操作
     Payment getPaymentById(@Param("id") Integer id);
}
