package com.fastcode.testdvdsample5.application.extended.country;

import com.fastcode.testdvdsample5.application.core.country.ICountryMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ICountryMapperExtended extends ICountryMapper {}
