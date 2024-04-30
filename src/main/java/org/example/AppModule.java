package org.example;

import com.google.inject.AbstractModule;
import com.google.inject.name.Named;
import org.example.service.Doctor;
//import org.example.service.NewPatient;
import org.example.service.Patient;
import org.example.service.PatientName;

public class AppModule extends AbstractModule {
    @Override
    protected void configure(){
        bind(Doctor.class).to(Patient.class);
        bind(String.class).annotatedWith(PatientName.class).toInstance("AB");
        bind(Integer.class).toInstance(40);
        bind(String.class).toInstance("address");
        bind(String.class).annotatedWith(Named.class).toInstance("email");
    }
}
