package com.fastcode.testdvdsample5.domain.extended.country;

import com.fastcode.testdvdsample5.domain.core.country.ICountryRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.stereotype.Repository;

@JaversSpringDataAuditable
@Repository("countryRepositoryExtended")
public interface ICountryRepositoryExtended extends ICountryRepository {
    //Add your custom code here
}
