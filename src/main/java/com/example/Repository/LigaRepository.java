package com.example.Repository;

import com.example.Model.Equipo;
import com.example.Model.Liga;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by jhipster on 4/11/15.
 */
@Repository
public interface LigaRepository extends PagingAndSortingRepository<Liga, Long> {

    List<Liga> findByNameContaining (String name);

}
