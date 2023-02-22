package it.attf.week6Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.attf.week6Project.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
