package com.kmorath.ecommerce.dao;

import com.kmorath.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")	// exposes endpint
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
