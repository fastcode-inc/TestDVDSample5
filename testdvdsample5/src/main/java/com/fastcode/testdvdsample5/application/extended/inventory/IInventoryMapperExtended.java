package com.fastcode.testdvdsample5.application.extended.inventory;

import com.fastcode.testdvdsample5.application.core.inventory.IInventoryMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IInventoryMapperExtended extends IInventoryMapper {}
