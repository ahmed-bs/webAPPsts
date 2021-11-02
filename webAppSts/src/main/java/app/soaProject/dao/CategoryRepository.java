package app.soaProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import app.soaProject.entities.category;

public interface CategoryRepository extends JpaRepository<category,Long> {


}
