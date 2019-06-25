package org.prototype.mvp.repository;

import java.util.List;

import org.prototype.mvp.domain.Menu;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface MenuRepository extends CrudRepository<Menu, Long>{
	
	@Query("SELECT m FROM Menu m")
    List<Menu> findByCategory();

}
