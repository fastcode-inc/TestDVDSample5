package com.fastcode.testdvdsample5.application.extended.store;

import com.fastcode.testdvdsample5.application.core.store.StoreAppService;
import com.fastcode.testdvdsample5.commons.logging.LoggingHelper;
import com.fastcode.testdvdsample5.domain.extended.address.IAddressRepositoryExtended;
import com.fastcode.testdvdsample5.domain.extended.staff.IStaffRepositoryExtended;
import com.fastcode.testdvdsample5.domain.extended.store.IStoreRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("storeAppServiceExtended")
public class StoreAppServiceExtended extends StoreAppService implements IStoreAppServiceExtended {

    public StoreAppServiceExtended(
        IStoreRepositoryExtended storeRepositoryExtended,
        IAddressRepositoryExtended addressRepositoryExtended,
        IStaffRepositoryExtended staffRepositoryExtended,
        IStoreMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(storeRepositoryExtended, addressRepositoryExtended, staffRepositoryExtended, mapper, logHelper);
    }
    //Add your custom code here

}
