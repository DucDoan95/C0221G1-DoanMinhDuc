package com.example.furama_resort.model.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "division")
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "division_id")
    private Integer divisionId;
    @Column(name = "division_name")
    private String divisionName;

    @OneToMany(mappedBy = "division")
    private Set<Employee> employeeSet;

    public Division() {
    }

    public Integer getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Integer divisionId) {
        this.divisionId = divisionId;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    public void setEmployeeSet(Set<Employee> employeeSet) {
        this.employeeSet = employeeSet;
    }
}
