package com.fastcode.testdvdsample5.application.extended.language;

import com.fastcode.testdvdsample5.application.core.language.LanguageAppService;
import com.fastcode.testdvdsample5.commons.logging.LoggingHelper;
import com.fastcode.testdvdsample5.domain.extended.language.ILanguageRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("languageAppServiceExtended")
public class LanguageAppServiceExtended extends LanguageAppService implements ILanguageAppServiceExtended {

    public LanguageAppServiceExtended(
        ILanguageRepositoryExtended languageRepositoryExtended,
        ILanguageMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(languageRepositoryExtended, mapper, logHelper);
    }
    //Add your custom code here

}
