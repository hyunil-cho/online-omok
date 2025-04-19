package com.online.omok.users.entity.member;

import com.online.omok.users.entity.member.role.Role;
import com.online.omok.users.entity.organization.Organization;
import com.online.omok.users.entity.UserGameStatus;
import com.online.omok.users.entity.base.BaseTimeEntity;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "member_info")
@DiscriminatorColumn
public class Member extends BaseTimeEntity {

    @Id
    @Column(name = "member_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME")
    private String userName;

    @OneToMany(mappedBy = "member")
    private List<MemberRoleAssignment> roles;

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


    public void setUserName(String userName) {
        this.userName = userName;
    }

//    public List<Role> getRoleType() {
//        return roleType;
//    }
//
//    public void setRoleType(List<Role> roleType) {
//        this.roleType = roleType;
//    }

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
