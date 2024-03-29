package com.dogeared.models.data;

import com.dogeared.models.Dogear;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface DogearDao extends CrudRepository<Dogear, Integer> {
  List<Dogear> findByUserUid(int userUid);
}
