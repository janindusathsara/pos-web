package lk.ijse.posweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lk.ijse.posweb.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
