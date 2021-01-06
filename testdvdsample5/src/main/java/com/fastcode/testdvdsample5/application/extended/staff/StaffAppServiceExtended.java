package com.fastcode.testdvdsample5.application.extended.staff;

import com.fastcode.testdvdsample5.application.core.staff.StaffAppService;
import com.fastcode.testdvdsample5.commons.logging.LoggingHelper;
import com.fastcode.testdvdsample5.domain.extended.address.IAddressRepositoryExtended;
import com.fastcode.testdvdsample5.domain.extended.staff.IStaffRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("staffAppServiceExtended")
public class StaffAppServiceExtended extends StaffAppService implements IStaffAppServiceExtended {

    public StaffAppServiceExtended(
        IStaffRepositoryExtended staffRepositoryExtended,
        IAddressRepositoryExtended addressRepositoryExtended,
        IStaffMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(staffRepositoryExtended, addressRepositoryExtended, mapper, logHelper);
    }
    //Add your custom code here

}
