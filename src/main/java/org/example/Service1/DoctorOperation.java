package org.example.Service1;

import com.google.inject.Inject;
import org.example.service.Doctor;
//import org.example.service.NewPatient;
import org.example.service.Patient;

public class DoctorOperation {
    //FIrst approach tightly coupled, difficult in unit testing
    /*Patient patient = new Patient();

    public void heartOperation(){
        patient.heartDisease();
    }*/

    //second Approach, loosely coupled, dependency is injected while creating constructor
    Doctor d;

    @Inject
    public DoctorOperation(Doctor d){
        this.d=d;
    }

    public void heartOperation(){
        d.heartDisease();
    }
}
