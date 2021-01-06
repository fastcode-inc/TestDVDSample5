package com.fastcode.testdvdsample5.domain.extended.authorization.userpermission;

import com.fastcode.testdvdsample5.domain.core.authorization.userpermission.IUserpermissionRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.stereotype.Repository;

@JaversSpringDataAuditable
@Repository("userpermissionRepositoryExtended")
public interface IUserpermissionRepositoryExtended extends IUserpermissionRepository {
    //Add your custom code here
}
