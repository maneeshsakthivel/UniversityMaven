/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

import Feedback.Certifications;
import Feedback.CertificationsDirectory;
import com.github.javafaker.Faker;

/**
 *
 * @author maneesh
 */
public class Alumini {
     Person person;
     int workExp;
     int internships;
     int intersnhipDuration;
     int salary;
     Faker fake;
     CertificationsDirectory directory;
     
     public Alumini(){
         fake = new Faker();
         directory = new CertificationsDirectory();
         this.salary = fake.number().numberBetween(60000, 200000);
     }
     
     public void addCertification(){
        
        Certifications cert = new Certifications(fake.educator().course(),
                 fake.number().randomDigitNotZero(),
                 fake.job().field(),
                 this);
        directory.addCertification(cert);
     }
     
     public CertificationsDirectory getCertificationsDirectory(){
         return directory;
     }
     
     public int getSalary(){
         return salary;
     }
}
