package com.aiwowo.springcloud.dao;

import com.aiwowo.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface PaymentDao
{
    int create(Payment payment);

    Payment getPaymentById(@Param("id") int id);
}
