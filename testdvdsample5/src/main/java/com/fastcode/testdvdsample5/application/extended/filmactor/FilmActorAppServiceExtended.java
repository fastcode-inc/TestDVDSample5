package com.fastcode.testdvdsample5.application.extended.filmactor;

import com.fastcode.testdvdsample5.application.core.filmactor.FilmActorAppService;
import com.fastcode.testdvdsample5.commons.logging.LoggingHelper;
import com.fastcode.testdvdsample5.domain.extended.actor.IActorRepositoryExtended;
import com.fastcode.testdvdsample5.domain.extended.film.IFilmRepositoryExtended;
import com.fastcode.testdvdsample5.domain.extended.filmactor.IFilmActorRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("filmActorAppServiceExtended")
public class FilmActorAppServiceExtended extends FilmActorAppService implements IFilmActorAppServiceExtended {

    public FilmActorAppServiceExtended(
        IFilmActorRepositoryExtended filmActorRepositoryExtended,
        IActorRepositoryExtended actorRepositoryExtended,
        IFilmRepositoryExtended filmRepositoryExtended,
        IFilmActorMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(filmActorRepositoryExtended, actorRepositoryExtended, filmRepositoryExtended, mapper, logHelper);
    }
    //Add your custom code here

}
