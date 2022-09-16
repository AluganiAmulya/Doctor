package com.springboot.doctor;
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.stereotype.Service;

@Service  

public class DoctorService implements IDoctorService   {

@Override  
public List<Doctor> findAll()  
{  
 
ArrayList<Doctor> doctors = new ArrayList<Doctor>();  
 
doctors.add(new Doctor(100, "varun", "dentist",30000));  
doctors.add(new Doctor(101, "srujan", "cardio", 60000));  
doctors.add(new Doctor(102, "ankith", "surgoen", 40000));  
doctors.add(new Doctor(103, "praneeth", "dermetologist", 24000));  
doctors.add(new Doctor(104, "shresta", "nuero", 30000));  
doctors.add(new Doctor(105, "abhi ", "dentist", 25000));  
 
return doctors;  
} 
}
