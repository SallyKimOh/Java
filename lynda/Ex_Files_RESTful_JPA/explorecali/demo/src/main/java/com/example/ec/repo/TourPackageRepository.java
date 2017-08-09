package com.example.ec.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.ec.domain.TourPackage;


@RepositoryRestResource(collectionResourceRel = "packages", path="packages")
public interface TourPackageRepository extends CrudRepository<TourPackage, String> {
    TourPackage findByName(@Param("name") String name);

	@Override
	@RestResource(exported=false)
	void delete(Iterable<? extends TourPackage> arg0);

	@Override
	@RestResource(exported=false)
	void delete(String arg0);

	@Override
	@RestResource(exported=false)
	void delete(TourPackage arg0);

	@Override
	@RestResource(exported=false)
	void deleteAll();

	@Override
	@RestResource(exported=false)
	<S extends TourPackage> Iterable<S> save(Iterable<S> arg0) ;
	@Override
	<S extends TourPackage> S save(S arg0);





}

