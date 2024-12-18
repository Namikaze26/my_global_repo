package com.example.ProdProj.Repository;

import com.example.ProdProj.Entity.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface usersRepository extends JpaRepository<users, Long> {
}

