package com.totex.email.domain;

import com.totex.email.enums.EmailStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_email")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmailModel {

    private final long serialVersionUUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID emailId;
    private UUID userId;
    private String emailTo;
    private String emailFrom;
    private String emailSubject;
    @Column(columnDefinition = "BODY")
    private String emailBody;
    private LocalDateTime sendDateEmail;
    private EmailStatus emailStatus;

}
