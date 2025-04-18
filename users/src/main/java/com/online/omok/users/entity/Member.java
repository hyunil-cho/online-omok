package com.online.omok.users.entity;

import com.online.omok.users.entity.base.BaseTimeEntity;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "member_info")
public class Member extends BaseTimeEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME")
    private String userName;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @OneToOne(cascade = CascadeType.ALL)
    private UserGameStatus gameStatus;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "org_id")
    //TODO :: 외래키 제약 조건에 대한 조사 더 필요
    private Organization organization;

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public Organization getOrganization() {
        return organization;
    }

    public UserGameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(UserGameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }
}
