package com.fastcode.testdvdsample5.restcontrollers.extended;

import com.fastcode.testdvdsample5.application.extended.authorization.user.IUserAppServiceExtended;
import com.fastcode.testdvdsample5.application.extended.authorization.userpermission.IUserpermissionAppServiceExtended;
import com.fastcode.testdvdsample5.application.extended.authorization.userrole.IUserroleAppServiceExtended;
import com.fastcode.testdvdsample5.commons.logging.LoggingHelper;
import com.fastcode.testdvdsample5.restcontrollers.core.UserController;
import com.fastcode.testdvdsample5.security.JWTAppService;
import org.springframework.core.env.Environment;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/extended")
public class UserControllerExtended extends UserController {

    public UserControllerExtended(
        IUserAppServiceExtended userAppServiceExtended,
        IUserpermissionAppServiceExtended userpermissionAppServiceExtended,
        IUserroleAppServiceExtended userroleAppServiceExtended,
        PasswordEncoder pEncoder,
        JWTAppService jwtAppService,
        LoggingHelper helper,
        Environment env
    ) {
        super(
            userAppServiceExtended,
            userpermissionAppServiceExtended,
            userroleAppServiceExtended,
            pEncoder,
            jwtAppService,
            helper,
            env
        );
    }
    //Add your custom code here

}
