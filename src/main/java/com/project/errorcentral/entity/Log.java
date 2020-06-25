package com.project.errorcentral.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@EntityListeners(AuditingEntityListener.class)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Table(name = "logs")
public class Log {
    @Id
    @GeneratedValue
    Long Id;

    @Column
    @Enumerated(EnumType.STRING)
    Level level;

    @Column
    String description;

    @Column
    String data;

    @Column
    Integer count;

    @Column
    LocalDateTime eventDate;

    @Column
    @CreatedDate
    LocalDateTime createdAt;

    @ManyToOne(cascade = CascadeType.PERSIST)
    Application application;

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Log ? ((Log) obj).getId().equals(this.getId()) : false;
    }
}
