package com.online.omok.users.entity.member;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@DiscriminatorValue("root")
@Entity
@PrimaryKeyJoinColumn(name = "ADMIN_ID")
public class AdminMember extends Member{

    private String tel;

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
