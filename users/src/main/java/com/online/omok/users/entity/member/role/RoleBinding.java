package com.online.omok.users.entity.member.role;

import com.online.omok.users.entity.base.BaseTimeEntity;
import jakarta.persistence.*;

@Entity
public class RoleBinding extends BaseTimeEntity {
    @Id
    @Column(name = "role_binding_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private short bindingId;

    @Column(name = "auth_description")
    private String desc;

}
