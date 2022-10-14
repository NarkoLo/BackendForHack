package com.example.backendforhack.entity;

import javax.persistence.*;

@Entity
@Table(name = "Drivers")

public class DriverEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "NSM")
    private String nsm;
    @Column(name = "VehicleType")
    private String VehicleType;
    @Column(name = "TaskID")
    private int taskId;
    @Column(name = "Login")
    private String login;
    @Column(name = "Password")
    private String password;

    public DriverEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNsm() {
        return nsm;
    }

    public void setNsm(String nsm) {
        this.nsm = nsm;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(String vehicleType) {
        VehicleType = vehicleType;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
