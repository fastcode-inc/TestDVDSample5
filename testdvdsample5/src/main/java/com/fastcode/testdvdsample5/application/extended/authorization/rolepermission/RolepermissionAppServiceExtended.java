package com.fastcode.testdvdsample5.application.extended.authorization.rolepermission;

import com.fastcode.testdvdsample5.application.core.authorization.rolepermission.RolepermissionAppService;
import com.fastcode.testdvdsample5.commons.logging.LoggingHelper;
import com.fastcode.testdvdsample5.domain.extended.authorization.permission.IPermissionRepositoryExtended;
import com.fastcode.testdvdsample5.domain.extended.authorization.role.IRoleRepositoryExtended;
import com.fastcode.testdvdsample5.domain.extended.authorization.rolepermission.IRolepermissionRepositoryExtended;
import com.fastcode.testdvdsample5.domain.extended.authorization.userrole.IUserroleRepositoryExtended;
import com.fastcode.testdvdsample5.security.JWTAppService;
import org.springframework.stereotype.Service;

@Service("rolepermissionAppServiceExtended")
public class RolepermissionAppServiceExtended
    extends RolepermissionAppService
    implements IRolepermissionAppServiceExtended {

    public RolepermissionAppServiceExtended(
        JWTAppService jwtAppService,
        IUserroleRepositoryExtended userroleRepositoryExtended,
        IRolepermissionRepositoryExtended rolepermissionRepositoryExtended,
        IPermissionRepositoryExtended permissionRepositoryExtended,
        IRoleRepositoryExtended roleRepositoryExtended,
        IRolepermissionMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(
            jwtAppService,
            userroleRepositoryExtended,
            rolepermissionRepositoryExtended,
            permissionRepositoryExtended,
            roleRepositoryExtended,
            mapper,
            logHelper
        );
    }
    //Add your custom code here

}
