package ru.vlapin.experiments.reacttraining.dao;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.vlapin.experiments.reacttraining.model.Cat;

@RepositoryRestResource
public interface CatRepository extends JpaRepository<Cat, UUID> {
}
