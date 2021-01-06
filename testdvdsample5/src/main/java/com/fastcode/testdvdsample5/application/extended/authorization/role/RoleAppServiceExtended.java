package com.fastcode.testdvdsample5.application.extended.authorization.role;

import com.fastcode.testdvdsample5.application.core.authorization.role.RoleAppService;
import com.fastcode.testdvdsample5.commons.logging.LoggingHelper;
import com.fastcode.testdvdsample5.domain.extended.authorization.role.IRoleRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("roleAppServiceExtended")
public class RoleAppServiceExtended extends RoleAppService implements IRoleAppServiceExtended {

    public RoleAppServiceExtended(
        IRoleRepositoryExtended roleRepositoryExtended,
        IRoleMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(roleRepositoryExtended, mapper, logHelper);
    }
    //Add your custom code here

}
