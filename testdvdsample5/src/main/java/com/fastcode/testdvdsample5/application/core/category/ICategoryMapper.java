package com.fastcode.testdvdsample5.application.core.category;

import com.fastcode.testdvdsample5.application.core.category.dto.*;
import com.fastcode.testdvdsample5.domain.core.category.CategoryEntity;
import java.time.*;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ICategoryMapper {
    CategoryEntity createCategoryInputToCategoryEntity(CreateCategoryInput categoryDto);

    CreateCategoryOutput categoryEntityToCreateCategoryOutput(CategoryEntity entity);

    CategoryEntity updateCategoryInputToCategoryEntity(UpdateCategoryInput categoryDto);

    UpdateCategoryOutput categoryEntityToUpdateCategoryOutput(CategoryEntity entity);

    FindCategoryByIdOutput categoryEntityToFindCategoryByIdOutput(CategoryEntity entity);
}
