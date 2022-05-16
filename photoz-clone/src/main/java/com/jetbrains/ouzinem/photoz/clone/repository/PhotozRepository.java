package com.jetbrains.ouzinem.photoz.clone.repository;

import com.jetbrains.ouzinem.photoz.clone.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotozRepository extends CrudRepository<Photo, Integer> {
}
