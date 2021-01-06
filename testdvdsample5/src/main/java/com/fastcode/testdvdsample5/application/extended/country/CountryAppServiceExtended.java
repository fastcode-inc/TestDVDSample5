package com.fastcode.testdvdsample5.application.extended.country;

import com.fastcode.testdvdsample5.application.core.country.CountryAppService;
import com.fastcode.testdvdsample5.commons.logging.LoggingHelper;
import com.fastcode.testdvdsample5.domain.extended.country.ICountryRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("countryAppServiceExtended")
public class CountryAppServiceExtended extends CountryAppService implements ICountryAppServiceExtended {

    public CountryAppServiceExtended(
        ICountryRepositoryExtended countryRepositoryExtended,
        ICountryMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(countryRepositoryExtended, mapper, logHelper);
    }
    //Add your custom code here

}
