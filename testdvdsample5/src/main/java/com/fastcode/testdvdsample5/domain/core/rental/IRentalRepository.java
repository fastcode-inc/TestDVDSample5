package com.fastcode.testdvdsample5.domain.core.rental;

import java.time.*;
import java.util.*;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@JaversSpringDataAuditable
@Repository("rentalRepository")
public interface IRentalRepository
    extends JpaRepository<RentalEntity, Integer>, QuerydslPredicateExecutor<RentalEntity> {}
