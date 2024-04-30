package org.example;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.example.Service1.DoctorOperation;
import org.example.service.Doctor;
//import org.example.service.NewPatient;
import org.example.service.Patient;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new AppModule());
        /*
        Doctor d = injector.getInstance(Doctor.class);
        DoctorOperation doctorOperation = new DoctorOperation(d);
        doctorOperation.heartOperation();
        */
//        DoctorOperation doctorOperation = injector.getInstance(DoctorOperation.class);
//        doctorOperation.heartOperation();
        DoctorOperation d = injector.getInstance(DoctorOperation.class);
        d.heartOperation();

    }
}