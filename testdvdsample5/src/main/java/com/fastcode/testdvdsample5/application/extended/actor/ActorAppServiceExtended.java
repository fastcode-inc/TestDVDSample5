package com.fastcode.testdvdsample5.application.extended.actor;

import com.fastcode.testdvdsample5.application.core.actor.ActorAppService;
import com.fastcode.testdvdsample5.commons.logging.LoggingHelper;
import com.fastcode.testdvdsample5.domain.extended.actor.IActorRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("actorAppServiceExtended")
public class ActorAppServiceExtended extends ActorAppService implements IActorAppServiceExtended {

    public ActorAppServiceExtended(
        IActorRepositoryExtended actorRepositoryExtended,
        IActorMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(actorRepositoryExtended, mapper, logHelper);
    }
    //Add your custom code here

}
