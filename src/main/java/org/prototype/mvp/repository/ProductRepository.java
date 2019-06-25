package org.prototype.mvp.repository;

import org.prototype.mvp.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository< Product,Long >{

}
