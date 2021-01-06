package com.fastcode.testdvdsample5.application.extended.address;

import com.fastcode.testdvdsample5.application.core.address.AddressAppService;
import com.fastcode.testdvdsample5.commons.logging.LoggingHelper;
import com.fastcode.testdvdsample5.domain.extended.address.IAddressRepositoryExtended;
import com.fastcode.testdvdsample5.domain.extended.city.ICityRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("addressAppServiceExtended")
public class AddressAppServiceExtended extends AddressAppService implements IAddressAppServiceExtended {

    public AddressAppServiceExtended(
        IAddressRepositoryExtended addressRepositoryExtended,
        ICityRepositoryExtended cityRepositoryExtended,
        IAddressMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(addressRepositoryExtended, cityRepositoryExtended, mapper, logHelper);
    }
    //Add your custom code here

}
