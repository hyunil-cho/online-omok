package com.online.omok.users.entity.member;

import com.online.omok.users.entity.base.BaseTimeEntity;
import com.online.omok.users.entity.member.role.Role;
import jakarta.persistence.*;

@Entity
public class MemberRoleAssignment extends BaseTimeEntity {

    @Id
    @Column(name = "member_role_assginment_id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

}
