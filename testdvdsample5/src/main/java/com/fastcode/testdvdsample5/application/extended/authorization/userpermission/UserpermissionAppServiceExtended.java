package com.fastcode.testdvdsample5.application.extended.authorization.userpermission;

import com.fastcode.testdvdsample5.application.core.authorization.userpermission.UserpermissionAppService;
import com.fastcode.testdvdsample5.commons.logging.LoggingHelper;
import com.fastcode.testdvdsample5.domain.extended.authorization.permission.IPermissionRepositoryExtended;
import com.fastcode.testdvdsample5.domain.extended.authorization.user.IUserRepositoryExtended;
import com.fastcode.testdvdsample5.domain.extended.authorization.userpermission.IUserpermissionRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("userpermissionAppServiceExtended")
public class UserpermissionAppServiceExtended
    extends UserpermissionAppService
    implements IUserpermissionAppServiceExtended {

    public UserpermissionAppServiceExtended(
        IUserpermissionRepositoryExtended userpermissionRepositoryExtended,
        IPermissionRepositoryExtended permissionRepositoryExtended,
        IUserRepositoryExtended userRepositoryExtended,
        IUserpermissionMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(
            userpermissionRepositoryExtended,
            permissionRepositoryExtended,
            userRepositoryExtended,
            mapper,
            logHelper
        );
    }
    //Add your custom code here

}
