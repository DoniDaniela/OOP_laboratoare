package com.oop.laborator6;

import java.util.Date;

public class Main {
    public static void main (String[]args)
    {
    }
}

class Address
{
    public String value;
}
class Phone
{
    public String value;
}
class History
{
    public String value;
}

class Hospital
{
    public String name;
    public Address address;
    public Phone phone;
}
class Department
{
    public Hospital hospital;
}
class Person<Gender>
{
    public String title;
    public String givenName;
    public String middleName;
    public String familyName;
    String name ()
    {
        return familyName + ' ' + middleName + ' ' + givenName;
    }
    public Date birthDate;
    public Gender gender;
    public Address homeAddress;
    public Phone phone;

}

class Patient extends Person
{
    public String id;
    public Integer age;
    public Date accepted;
    public History sickness;
    public String prescriptions;
    public String allergies;
    public String specialReqs;
}

class Staff extends Person
{
    public Department department;
    public Date joined;
    public String education;
    public String certification;
    public String languages;
}
class OperationsStaff extends Staff
{
}
class Doctor extends OperationsStaff
{
    public String specialty;
    public String locations;
}
class Nurse extends OperationsStaff
{
    public String specialty;
    public String locations;
}

class Surgeon extends Doctor
{
    public String specialty;
    public String locations;
}

class AdministrativeStaff extends Staff
{
}

class FrontDeskStaff extends AdministrativeStaff
{
}
class Receptionist extends FrontDeskStaff
{
}

class TechnicalStaff extends Staff
{
}
class Technician extends TechnicalStaff
{
}
class Technologist extends TechnicalStaff
{
}
class SurgicalTechnologist extends Technologist
{
}

class JoinPatientOperationsStaff
{
    public Patient patient;
    public OperationsStaff operationsStaff;
}
class JoinHospitalPerson
{
    public Hospital hospital;
    public Person person;
}
