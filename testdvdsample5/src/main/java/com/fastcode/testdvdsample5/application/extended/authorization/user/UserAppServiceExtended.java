package com.fastcode.testdvdsample5.application.extended.authorization.user;

import com.fastcode.testdvdsample5.addons.reporting.domain.dashboardversion.*;
import com.fastcode.testdvdsample5.addons.reporting.domain.dashboardversionreport.*;
import com.fastcode.testdvdsample5.addons.reporting.domain.reportversion.*;
import com.fastcode.testdvdsample5.application.core.authorization.user.UserAppService;
import com.fastcode.testdvdsample5.commons.logging.LoggingHelper;
import com.fastcode.testdvdsample5.domain.core.authorization.userpreference.IUserpreferenceRepository;
import com.fastcode.testdvdsample5.domain.extended.authorization.user.IUserRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("userAppServiceExtended")
public class UserAppServiceExtended extends UserAppService implements IUserAppServiceExtended {

    public UserAppServiceExtended(
        IDashboardversionRepository dashboardversionRepository,
        IReportversionRepository reportversionRepository,
        IDashboardversionreportRepository reportDashboardRepository,
        IUserRepositoryExtended userRepositoryExtended,
        IUserpreferenceRepository userpreferenceRepository,
        IUserMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(
            dashboardversionRepository,
            reportversionRepository,
            reportDashboardRepository,
            userRepositoryExtended,
            userpreferenceRepository,
            mapper,
            logHelper
        );
    }
    //Add your custom code here

}
