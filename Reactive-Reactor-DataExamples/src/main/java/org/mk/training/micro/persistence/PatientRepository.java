package org.mk.training.micro.persistence;

import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface PatientRepository extends ReactiveCrudRepository<PatientEntity, String> {
    Flux<PatientEntity> findByMedicalRecordNumber(String medicalRecordNumber);

    @Query("{'lastName':{'$regex':'?0','$options':'i'}}")
    Flux<PatientEntity> searchByLastName(String lastName, Pageable page);

    @Query("{'firstName':{'$regex':'?0','$options':'i'}}")
    Flux<PatientEntity> searchByFirstName(String firstName, Pageable page);

    @Query("{ $or: [ { 'lastName' : {$regex:?0,$options:'i'} }, { 'firstName' : {$regex:?0,$options:'i'} } ] }")
    Flux<PatientEntity> searchByName(String name, Pageable page);
}