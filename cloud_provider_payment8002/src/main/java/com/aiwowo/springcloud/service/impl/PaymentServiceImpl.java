package com.aiwowo.springcloud.service.impl;


import com.aiwowo.springcloud.dao.PaymentDao;
import com.aiwowo.springcloud.entity.Payment;
import com.aiwowo.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class PaymentServiceImpl implements PaymentService
{
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(int id)
    {
        return paymentDao.getPaymentById(id);
    }
}
