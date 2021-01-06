package com.fastcode.testdvdsample5.application.extended.film;

import com.fastcode.testdvdsample5.application.core.film.IFilmMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IFilmMapperExtended extends IFilmMapper {}
