package org.coupon.couponsunbbang.domain.user.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "user")
@NoArgsConstructor(access = AccessLevel.PROTECTED)

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id; // 회원 고유번호

    @Column(nullable = false, length = 100)
}
