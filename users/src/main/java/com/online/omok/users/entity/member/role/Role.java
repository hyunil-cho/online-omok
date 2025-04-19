package com.online.omok.users.entity.member.role;

import com.online.omok.users.entity.base.BaseTimeEntity;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Role extends BaseTimeEntity {

    @Id
    @Column(name = "role_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private short id;

    private String roleName;


}
