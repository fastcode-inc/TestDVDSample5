package com.fastcode.testdvdsample5.application.extended.rental;

import com.fastcode.testdvdsample5.application.core.rental.RentalAppService;
import com.fastcode.testdvdsample5.commons.logging.LoggingHelper;
import com.fastcode.testdvdsample5.domain.extended.customer.ICustomerRepositoryExtended;
import com.fastcode.testdvdsample5.domain.extended.inventory.IInventoryRepositoryExtended;
import com.fastcode.testdvdsample5.domain.extended.rental.IRentalRepositoryExtended;
import com.fastcode.testdvdsample5.domain.extended.staff.IStaffRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("rentalAppServiceExtended")
public class RentalAppServiceExtended extends RentalAppService implements IRentalAppServiceExtended {

    public RentalAppServiceExtended(
        IRentalRepositoryExtended rentalRepositoryExtended,
        ICustomerRepositoryExtended customerRepositoryExtended,
        IInventoryRepositoryExtended inventoryRepositoryExtended,
        IStaffRepositoryExtended staffRepositoryExtended,
        IRentalMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(
            rentalRepositoryExtended,
            customerRepositoryExtended,
            inventoryRepositoryExtended,
            staffRepositoryExtended,
            mapper,
            logHelper
        );
    }
    //Add your custom code here

}
