package com.online.omok.users.entity;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Transactional
public interface MemberRepository extends JpaRepository<Member, Long> {
}
