package app.soaProject.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import app.soaProject.entities.transaction;

public interface TransactionRepository extends JpaRepository<transaction,Long> {
}
