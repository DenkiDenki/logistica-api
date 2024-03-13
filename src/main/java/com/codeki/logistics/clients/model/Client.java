package com.codeki.logistics.clients.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String cod;
    private String address;
    private String city;
    private LocalDateTime lastVisit;
    private double debt;
    private String dealerDay;

    public Client(String cod, String address, String city, LocalDateTime lastVisit, double debt, String dealerDay) {
        this.cod = cod;
        this.address = address;
        this.city = city;
        this.lastVisit = lastVisit;
        this.debt = debt;
        this.dealerDay = dealerDay;
    }
}