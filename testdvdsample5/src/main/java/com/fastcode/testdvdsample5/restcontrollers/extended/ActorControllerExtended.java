package com.fastcode.testdvdsample5.restcontrollers.extended;

import com.fastcode.testdvdsample5.application.extended.actor.IActorAppServiceExtended;
import com.fastcode.testdvdsample5.application.extended.filmactor.IFilmActorAppServiceExtended;
import com.fastcode.testdvdsample5.commons.logging.LoggingHelper;
import com.fastcode.testdvdsample5.restcontrollers.core.ActorController;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/actor/extended")
public class ActorControllerExtended extends ActorController {

    public ActorControllerExtended(
        IActorAppServiceExtended actorAppServiceExtended,
        IFilmActorAppServiceExtended filmActorAppServiceExtended,
        LoggingHelper helper,
        Environment env
    ) {
        super(actorAppServiceExtended, filmActorAppServiceExtended, helper, env);
    }
    //Add your custom code here

}
