package com.fastcode.testdvdsample5.application.extended.city;

import com.fastcode.testdvdsample5.application.core.city.CityAppService;
import com.fastcode.testdvdsample5.commons.logging.LoggingHelper;
import com.fastcode.testdvdsample5.domain.extended.city.ICityRepositoryExtended;
import com.fastcode.testdvdsample5.domain.extended.country.ICountryRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("cityAppServiceExtended")
public class CityAppServiceExtended extends CityAppService implements ICityAppServiceExtended {

    public CityAppServiceExtended(
        ICityRepositoryExtended cityRepositoryExtended,
        ICountryRepositoryExtended countryRepositoryExtended,
        ICityMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(cityRepositoryExtended, countryRepositoryExtended, mapper, logHelper);
    }
    //Add your custom code here

}
