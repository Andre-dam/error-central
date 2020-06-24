package com.project.errorcentral.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;


@Entity
@EntityListeners(AuditingEntityListener.class)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Table(name = "users")
public class User {
    @Id
    String email;

    @Column
    @NotNull
    String name;

    @Column
    @NotNull
    String password;

    @Column
    @CreatedDate
    LocalDateTime createdAt;

    @Override
    public boolean equals(Object obj) {
        return obj instanceof User ? ((User) obj).getEmail().equals(this.getEmail()) : false;
    }
}
