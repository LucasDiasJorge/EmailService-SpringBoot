package com.email.emailservice.repositories;

import com.email.emailservice.models.AbstractModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbstractRepository extends JpaRepository<AbstractModel, Long> {

}
