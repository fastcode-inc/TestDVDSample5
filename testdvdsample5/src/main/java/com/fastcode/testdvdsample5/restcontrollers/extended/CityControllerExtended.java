package com.fastcode.testdvdsample5.restcontrollers.extended;

import com.fastcode.testdvdsample5.application.extended.address.IAddressAppServiceExtended;
import com.fastcode.testdvdsample5.application.extended.city.ICityAppServiceExtended;
import com.fastcode.testdvdsample5.application.extended.country.ICountryAppServiceExtended;
import com.fastcode.testdvdsample5.commons.logging.LoggingHelper;
import com.fastcode.testdvdsample5.restcontrollers.core.CityController;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/city/extended")
public class CityControllerExtended extends CityController {

    public CityControllerExtended(
        ICityAppServiceExtended cityAppServiceExtended,
        IAddressAppServiceExtended addressAppServiceExtended,
        ICountryAppServiceExtended countryAppServiceExtended,
        LoggingHelper helper,
        Environment env
    ) {
        super(cityAppServiceExtended, addressAppServiceExtended, countryAppServiceExtended, helper, env);
    }
    //Add your custom code here

}
