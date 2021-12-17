package app.soaProject.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import app.soaProject.entities.AppRole;



public interface AppRoleRepository extends JpaRepository<AppRole,Long> {
    public AppRole findByRoleName(String roleName);
}
