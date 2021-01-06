package com.fastcode.testdvdsample5.domain.extended.customer;

import com.fastcode.testdvdsample5.domain.core.customer.ICustomerRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.stereotype.Repository;

@JaversSpringDataAuditable
@Repository("customerRepositoryExtended")
public interface ICustomerRepositoryExtended extends ICustomerRepository {
    //Add your custom code here
}
