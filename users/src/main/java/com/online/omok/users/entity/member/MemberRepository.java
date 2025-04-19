package com.online.omok.users.entity.member;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface MemberRepository extends JpaRepository<Member, Long> {
}
