package org.mk.training.micro.service;

//import io.reactivex.rxjava3.core.Maybe;
//import io.reactivex.rxjava3.core.Observable;
//import io.reactivex.rxjava3.core.Single;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.mk.training.micro.persistence.PatientDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Tag(
        name = "Patient",
        description = "REST API for composite product information."
)
public interface PatientService {
    @ResponseStatus(HttpStatus.ACCEPTED)
    @PostMapping(
            value = {"/patient"},
            consumes = {"application/json"}
    )
    Maybe<PatientDTO> createPatient(@RequestBody PatientDTO var1);

    @GetMapping(
            value = {"/patients"},
            produces = {"application/json"}
    )
    Observable<PatientDTO> searchPatients(@RequestParam(value = "lastName",required = true,defaultValue = "") String var1, @RequestParam(value = "firstName",required = true,defaultValue = "") String var2, @RequestParam(value = "page",defaultValue = "0") int var3, @RequestParam(value = "size",defaultValue = "10") int var4);

    @GetMapping(
            value = {"/patient/{medicalRecordNumber}"},
            produces = {"application/json"}
    )
    Observable<PatientDTO> getPatient(@PathVariable("medicalRecordNumber") String var1);

    @PutMapping(
            path = {"/patient/{medicalRecordNumber}"}
    )
    Maybe<PatientDTO> savePatient(@PathVariable("medicalRecordNumber") String var1, @RequestBody PatientDTO var2);

    Maybe<PatientDTO> deletePatient(String var1);
}

