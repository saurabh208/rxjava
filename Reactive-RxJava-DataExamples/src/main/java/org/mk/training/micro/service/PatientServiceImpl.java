package org.mk.training.micro.service;



import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import org.mk.training.micro.exceptions.InvalidInputException;
import org.mk.training.micro.exceptions.NotFoundException;
import org.mk.training.micro.persistence.PatientDTO;
import org.mk.training.micro.persistence.PatientEntity;
import org.mk.training.micro.persistence.PatientRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RestController;
import reactor.util.function.Tuple2;

import java.util.logging.Level;

@RestController
public class PatientServiceImpl implements PatientService {
    private static final Logger LOG = LoggerFactory.getLogger(PatientServiceImpl.class);
    private final PatientRepository repository;
    private final PatientMapper mapper;


    @Autowired
    public PatientServiceImpl(PatientRepository repository, PatientMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;

    }

    public Maybe<PatientDTO> createPatient(PatientDTO body) {
        /**
         * This is the data layer and the idea here is to check the mandatory parameters
         * if not return an empty result. Throwing an exception from here is bad for
         * performance because it has to travel through more than one layers
         * before it reaches the frontend.
         * Only the mandatory exceptions must be thrown back it must be the last resort
         */
        LOG.debug("Creating Patient with MRN:{}", body.getMedicalRecordNumber());
        if (body.getMedicalRecordNumber() != null && !body.getMedicalRecordNumber().isEmpty()) {

            return null;
        } else return Maybe.empty();
    }

    public Observable<PatientDTO> getPatient(String medicalRecordNumber) {
        /**
         * This is the data layer and the idea here is to check the mandatory parameters
         * if not return an empty result. Throwing an exception from here is bad for
         * performance because it has to travel through more than one layers
         * before it reaches the frontend.
         * Only the mandatory exceptions must be thrown back it must be the last resort
         */
        LOG.debug("Getting Patient with MRN:{}", medicalRecordNumber);
        if (medicalRecordNumber != null && !medicalRecordNumber.isEmpty()) {
            return null;
        } else {
            return Observable.empty();
        }
    }

    public Observable<PatientDTO> searchPatients(String lastName, String firstName, int page, int size) {
        /**
         * This is the data layer and the idea here is to check the mandatory parameters
         * if not return an empty result. Throwing an exception from here is bad for
         * performance because it has to travel through more than one layers
         * before it reaches the frontend.
         * Only the mandatory exceptions must be thrown back it must be the last resort
         */
        return null;
    }

    public Maybe<PatientDTO> savePatient(String medicalRecordNumber, PatientDTO patientDTO) {
        /**
         * This is the data layer and the idea here is to check the mandatory parameters
         * if not return an empty result. Throwing an exception from here is bad for
         * performance because it has to travel through more than one layers
         * before it reaches the frontend.
         * Only the mandatory exceptions must be thrown back it must be the last resort
         */

        return null;
    }

    public Maybe<PatientDTO> deletePatient(String medicalRecordNumber) {
        return null;
    }


}
