package com.fastcode.testdvdsample5.application.extended.category;

import com.fastcode.testdvdsample5.application.core.category.CategoryAppService;
import com.fastcode.testdvdsample5.commons.logging.LoggingHelper;
import com.fastcode.testdvdsample5.domain.extended.category.ICategoryRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("categoryAppServiceExtended")
public class CategoryAppServiceExtended extends CategoryAppService implements ICategoryAppServiceExtended {

    public CategoryAppServiceExtended(
        ICategoryRepositoryExtended categoryRepositoryExtended,
        ICategoryMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(categoryRepositoryExtended, mapper, logHelper);
    }
    //Add your custom code here

}
