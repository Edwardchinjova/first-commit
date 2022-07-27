package com.example.kenacfinale.repository;


import com.example.kenacfinale.model.SaveDataRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SaveDataDAO extends JpaRepository<SaveDataRequest, Long> {

    @Query(value = "exec commitKenacLoans :createdBy,:roleid", nativeQuery = true)
    boolean updateNeccessaryTables(String createdBy, String roleid);

//    @Query(value = "Select DISTINCT * from kenac where id_number = :idNo order by  id_number desc ", nativeQuery = true)
//    List<SavedDataResponse> getSavedData(String idNo);
}
