package com.nt.projectclasses;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobileDao extends CrudRepository<Employee, Long> {

}
