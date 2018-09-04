package com.demo.desjardins.labfinance.repo;

import com.demo.desjardins.labfinance.model.Doc;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

public interface DocumentRepo extends CrudRepository<Doc, String> {

    @Query("{ 'documents.categorieID' : ?0 }")
    @RestResource(path = "findByCategory", rel = "findByCategory")
    Doc findByID(@Param("id") String categoryId);
}
