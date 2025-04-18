package com.online.omok.users;

import com.online.omok.users.entity.*;
import com.online.omok.users.service.UserMemberService;
import jakarta.transaction.Transactional;
import org.aspectj.weaver.ast.Or;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class OmokUserApplication {

	public static void main(String[] args) throws InterruptedException {
		ConfigurableApplicationContext run = SpringApplication.run(OmokUserApplication.class, args);

		UserMemberService svc = run.getBean(UserMemberService.class);
		
		Member member = new Member();
		member.setRoleType(RoleType.PLAYER);
		member.setUserName("현재");

		svc.createAndSave(member);

		UserGameStatus status = new UserGameStatus();
		status.setUserId(member.getId());
		status.setWinningCnt(10);
		status.setGamesCnt(11);

		svc.updateUserStatus(member.getId(), status);

	}

}
