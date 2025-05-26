package com.examly.springappmedicine.model;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class VitalSign {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vitalSignId;
    private LocalDateTime date;
    private float temperature;
    private int pulse;
    private int respirationRate;
    private int bloodPressureSystolic;
    private int bloodPressureDiastolic;

    @ManyToOne
    private Patient patient;

    public VitalSign(int vitalSignId, LocalDateTime date, float temperature, int pulse, int respirationRate,
            int bloodPressureSystolic, int bloodPressureDiastolic, Patient patient) {
        this.vitalSignId = vitalSignId;
        this.date = date;
        this.temperature = temperature;
        this.pulse = pulse;
        this.respirationRate = respirationRate;
        this.bloodPressureSystolic = bloodPressureSystolic;
        this.bloodPressureDiastolic = bloodPressureDiastolic;
        this.patient = patient;
    }
    
}
