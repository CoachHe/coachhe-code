package com.coachhe.springcloud.dao;

import com.coachhe.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;


public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
