package br.com.srv.topic.srvtopic.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_user;
    private String nome;
    private String email;

    @OneToMany(mappedBy = "user")
    private Set<Topic> topicSet;

    private String password;

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public Set<Topic> getTopicSet() {
        return topicSet;
    }

    public void setTopicSet(Set<Topic> topicSet) {
        this.topicSet = topicSet;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id_user=" + id_user +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", topicSet=" + topicSet +
                ", password='" + password + '\'' +
                '}';
    }
}
