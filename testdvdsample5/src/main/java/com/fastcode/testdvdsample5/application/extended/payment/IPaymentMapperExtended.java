package com.fastcode.testdvdsample5.application.extended.payment;

import com.fastcode.testdvdsample5.application.core.payment.IPaymentMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IPaymentMapperExtended extends IPaymentMapper {}
