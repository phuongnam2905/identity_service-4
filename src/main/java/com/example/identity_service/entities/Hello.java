package com.example.identity_service.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "hello")
public class Hello {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String msg;

    // Getter & Setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getMsg() { return msg; }
    public void setMsg(String msg) { this.msg = msg; }
}

