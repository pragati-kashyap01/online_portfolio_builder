package com.portfolio.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "portfolio_data")
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @Column(length = 2000)
    private String about;

    @Column(length = 2000)
    private String skills;

    @Column(length = 2000)
    private String projects;

    @Column(name = "template_choice")
    private String templateChoice;

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getAbout() { return about; }
    public void setAbout(String about) { this.about = about; }
    public String getSkills() { return skills; }
    public void setSkills(String skills) { this.skills = skills; }
    public String getProjects() { return projects; }
    public void setProjects(String projects) { this.projects = projects; }
    public String getTemplateChoice() { return templateChoice; }
    public void setTemplateChoice(String templateChoice) { this.templateChoice = templateChoice; }
}
