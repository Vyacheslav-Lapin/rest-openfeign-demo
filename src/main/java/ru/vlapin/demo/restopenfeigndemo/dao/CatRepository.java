package ru.vlapin.demo.restopenfeigndemo.dao;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlapin.demo.restopenfeigndemo.model.Cat;

public interface CatRepository extends JpaRepository<Cat, UUID> {
}
