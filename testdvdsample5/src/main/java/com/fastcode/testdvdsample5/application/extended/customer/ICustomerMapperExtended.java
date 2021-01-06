package com.fastcode.testdvdsample5.application.extended.customer;

import com.fastcode.testdvdsample5.application.core.customer.ICustomerMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ICustomerMapperExtended extends ICustomerMapper {}
