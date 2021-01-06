package com.fastcode.testdvdsample5.application.extended.filmcategory;

import com.fastcode.testdvdsample5.application.core.filmcategory.IFilmCategoryMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IFilmCategoryMapperExtended extends IFilmCategoryMapper {}
