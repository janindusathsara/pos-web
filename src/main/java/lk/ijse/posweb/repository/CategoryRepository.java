package lk.ijse.posweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lk.ijse.posweb.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
