package com.project.errorcentral.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@EntityListeners(AuditingEntityListener.class)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Table(name = "applications")
public class Application {
    @Id
    @GeneratedValue
    Long Id;

    @Column
    @NotNull
    String name;

    @Column
    @CreatedDate
    LocalDateTime createdAt;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @NotNull
    User user;

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Application ? ((Application) obj).getId().equals(this.getId()) : false;
    }
}
