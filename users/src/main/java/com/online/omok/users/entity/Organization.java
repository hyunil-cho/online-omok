package com.online.omok.users.entity;

import com.online.omok.users.entity.base.BaseTimeEntity;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "org_info")
public class Organization extends BaseTimeEntity {
    @Id
    @Column(name = "org_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany(mappedBy = "organization")
    private List<Member> members = new ArrayList<>();

    @Column(name = "org_name")
    private String orgName;

    public void save(Member member){
        this.members.add(member);
        member.setOrganization(this);
    }

    public long getId() {
        return id;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public List<Member> getMembers() {
        return members;
    }
}
