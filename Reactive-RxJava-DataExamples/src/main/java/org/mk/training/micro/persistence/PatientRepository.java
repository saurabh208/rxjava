package org.mk.training.micro.persistence;

import io.reactivex.Observable;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.Query;
//import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.data.repository.reactive.RxJava2CrudRepository;
import reactor.core.publisher.Flux;

public interface PatientRepository extends RxJava2CrudRepository<PatientEntity, String> {
    Observable<PatientEntity> findByMedicalRecordNumber(String medicalRecordNumber);

    @Query("{'lastName':{'$regex':'?0','$options':'i'}}")
    Observable<PatientEntity> searchByLastName(String lastName, Pageable page);

    @Query("{'firstName':{'$regex':'?0','$options':'i'}}")
    Observable<PatientEntity> searchByFirstName(String firstName, Pageable page);

    @Query("{ $or: [ { 'lastName' : {$regex:?0,$options:'i'} }, { 'firstName' : {$regex:?0,$options:'i'} } ] }")
    Observable<PatientEntity> searchByName(String name, Pageable page);
}