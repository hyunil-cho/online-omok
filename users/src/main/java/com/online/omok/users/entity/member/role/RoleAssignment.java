package com.online.omok.users.entity.member.role;

import com.online.omok.users.entity.base.BaseTimeEntity;
import jakarta.persistence.*;

@Entity
public class RoleAssignment extends BaseTimeEntity {
    @Id
    @Column(name = "role_assignment_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // ManyToOne: 여러 Assignment가 하나의 Role과 연결
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id")
    private Role role;

    // ManyToOne: 여러 Assignment가 하나의 RoleBinding과 연결
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_binding_id")
    private RoleBinding roleBinding;
}
