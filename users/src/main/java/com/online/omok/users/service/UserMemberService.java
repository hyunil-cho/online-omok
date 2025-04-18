package com.online.omok.users.service;

import com.online.omok.users.entity.*;
import jakarta.annotation.PostConstruct;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserMemberService {

    private final MemberRepository memberRepository;
    private final OrganizationRepository organizationRepository;

    public UserMemberService(MemberRepository memberRepository, OrganizationRepository organizationRepository) {
        this.memberRepository = memberRepository;
        this.organizationRepository = organizationRepository;
    }
}
