package br.com.srv.topic.srvtopic.model;

import javax.persistence.*;

@Entity
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id_topic;
    Integer status;
    String topic;
    @ManyToOne
    @JoinColumn(name = "id_user",nullable = false)
    User user;

    public Long getId_topic() {
        return id_topic;
    }

    public void setId_topic(Long id_topic) {
        this.id_topic = id_topic;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "id_topic=" + id_topic +
                ", status=" + status +
                ", topic='" + topic + '\'' +
                ", user=" + user +
                '}';
    }
}
