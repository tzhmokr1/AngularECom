package com.kmorath.ecommerce.config;

import com.kmorath.ecommerce.dao.Order;
import com.kmorath.ecommerce.entity.Country;
import com.kmorath.ecommerce.entity.Product;
import com.kmorath.ecommerce.entity.ProductCategory;
import com.kmorath.ecommerce.entity.State;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.EntityType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class myDataRestConfig implements RepositoryRestConfigurer {
	
	@Value("${allowed.origins}")
	private String[] theAllowedOriginStrings;
	
	private EntityManager entityManager;

	@Autowired
	public myDataRestConfig(EntityManager _entityManager) {
		entityManager = _entityManager;
	}
	
	

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {

		HttpMethod[] theUnsupportedActions = { HttpMethod.PUT, HttpMethod.POST,
												HttpMethod.PATCH, HttpMethod.DELETE };

		// disable HTTP methods for Product, ProductCategory, Country and State : PUT, POST, PATCH and DELETE
		disableHttpMethods(Product.class, config, theUnsupportedActions);
		disableHttpMethods(ProductCategory.class, config, theUnsupportedActions);
		disableHttpMethods(Country.class, config, theUnsupportedActions);
		disableHttpMethods(State.class, config, theUnsupportedActions);
		disableHttpMethods(Order.class, config, theUnsupportedActions);

		// call an internal helper method
		exposeIds(config);
		
		// configure cors mapping
		cors.addMapping(config.getBasePath() + "/**").allowedOrigins(theAllowedOriginStrings);
	}
	
	

	private void disableHttpMethods(Class theClass, RepositoryRestConfiguration config,
			HttpMethod[] theUnsupportedActions) {
		config.getExposureConfiguration().forDomainType(theClass)
				.withItemExposure((metdata, HttpMethod) -> HttpMethod.disable(theUnsupportedActions))
				.withCollectionExposure((metdata, HttpMethod) -> HttpMethod.disable(theUnsupportedActions));
	}
	
	

	private void exposeIds(RepositoryRestConfiguration config) {

		// expose entity ids
		//
		// - gets a list of all entity classes from the entity manager
		Set<EntityType<?>> entities = entityManager.getMetamodel().getEntities();

		// - create an array of the entity types
		List<Class> entityClasses = new ArrayList<>();

		// - get the entity types for the entities
		for (EntityType tempEntityType : entities) {
			entityClasses.add(tempEntityType.getJavaType());
		}

		// - expose the entity ids for the array of entity/domain types
		Class[] domainTypes = entityClasses.toArray(new Class[0]);
		config.exposeIdsFor(domainTypes);
	}
}
