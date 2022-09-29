package org.mk.training.micro.persistence;

import java.util.Date;
import java.util.List;

public class PatientDTO {
    private String medicalRecordNumber;
    private String firstName;
    private String lastName;
    private String middleName;
    private Date dateOfBirth;
    private String homePhone;
    private String mobilePhone;
    private String Address;
    private String nextOfKin_lastname;
    private String nextOfKin_firstname;
    private String serviceAddress;
    private Gender gender;
    private List<String> allergies;
    private List<String> allergiesReaction;
    private List<String> medicationList;
    private List<String> knownMedicalCondtions;
    private String concerns;

    public PatientDTO(String medicalRecordNumber, String firstName, String lastName, String middleName, Date dateOfBirth, String homePhone, String mobilePhone, String address, String nextOfKin_lastname, String nextOfKin_firstname, Gender gender, List<String> allergies, List<String> allergiesReaction, List<String> medicationList, List<String> knownMedicalCondtions, String concerns) {
        this.medicalRecordNumber = medicalRecordNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.Address = address;
        this.nextOfKin_lastname = nextOfKin_lastname;
        this.nextOfKin_firstname = nextOfKin_firstname;
        this.gender = gender;
        this.allergies = allergies;
        this.allergiesReaction = allergiesReaction;
        this.medicationList = medicationList;
        this.knownMedicalCondtions = knownMedicalCondtions;
        this.concerns = concerns;
    }

    public PatientDTO() {
        this.medicalRecordNumber = null;
        this.firstName = null;
        this.lastName = null;
        this.middleName = null;
        this.dateOfBirth = null;
        this.homePhone = null;
        this.mobilePhone = null;
        this.Address = null;
        this.nextOfKin_lastname = null;
        this.nextOfKin_firstname = null;
        this.gender = null;
        this.allergies = null;
        this.allergiesReaction = null;
        this.medicationList = null;
        this.knownMedicalCondtions = null;
        this.concerns = null;
    }

    public void setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress;
    }

    public String getMedicalRecordNumber() {
        return this.medicalRecordNumber;
    }

    public void setMedicalRecordNumber(String medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getHomePhone() {
        return this.homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getAddress() {
        return this.Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getNextOfKin_lastname() {
        return this.nextOfKin_lastname;
    }

    public void setNextOfKin_lastname(String nextOfKin_lastname) {
        this.nextOfKin_lastname = nextOfKin_lastname;
    }

    public String getNextOfKin_firstname() {
        return this.nextOfKin_firstname;
    }

    public void setNextOfKin_firstname(String nextOfKin_firstname) {
        this.nextOfKin_firstname = nextOfKin_firstname;
    }

    public String getServiceAddress() {
        return this.serviceAddress;
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<String> getAllergies() {
        return this.allergies;
    }

    public void setAllergies(List<String> allergies) {
        this.allergies = allergies;
    }

    public List<String> getAllergiesReaction() {
        return this.allergiesReaction;
    }

    public void setAllergiesReaction(List<String> allergiesReaction) {
        this.allergiesReaction = allergiesReaction;
    }

    public List<String> getMedicationList() {
        return this.medicationList;
    }

    public void setMedicationList(List<String> medicationList) {
        this.medicationList = medicationList;
    }

    public List<String> getKnownMedicalCondtions() {
        return this.knownMedicalCondtions;
    }

    public void setKnownMedicalCondtions(List<String> knownMedicalCondtions) {
        this.knownMedicalCondtions = knownMedicalCondtions;
    }

    public String getConcerns() {
        return this.concerns;
    }

    public void setConcerns(String concerns) {
        this.concerns = concerns;
    }

    public static enum Gender {
        MALE,
        FEMALE,
        OTHER;

        private Gender() {
        }
    }
}
