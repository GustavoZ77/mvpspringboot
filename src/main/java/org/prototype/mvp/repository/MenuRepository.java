package org.prototype.mvp.repository;

import java.util.List;

import org.prototype.mvp.domain.Menu;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

public interface MenuRepository extends Repository<Menu, Long>{
	
	
	@Query("SELECT m FROM Menu m WHERE m.category.description LIKE CONCAT('%',:category,'%')")
    List<Menu> findByCategory(@Param("category") String category);

}
