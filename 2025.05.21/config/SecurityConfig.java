package com.rabbit.Chap12.config;

import org.springframework.security.core.userdetails.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration //환경설정
@EnableWebSecurity // 시큐리티(보안) 관련 설정
public class SecurityConfig {
	
	// 비밀번호 암호화 빈을 생성
	@Bean // 빈 등록
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	// 사용자 정보
	@Bean // 빈등록
	public UserDetailsService user() {
		// 사용자 계정 => 게스트 계정
		UserDetails user = User.builder().username("guest").password(passwordEncoder().encode("g1234")).roles("USER").build();
		UserDetails manager = User.builder().username("manager").password(passwordEncoder().encode("m1234")).roles("MANAGER").build();
		UserDetails admin = User.builder().username("admin").password(passwordEncoder().encode("a1234")).roles("ADMIN").build();
		return new InMemoryUserDetailsManager(user, manager, admin);
	}
	
	@Bean
	SecurityFilterChain examMethod01(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(
				authorize -> authorize
				.requestMatchers("/member/**").hasAnyRole("USER","ADMIN")
				.requestMatchers("/manager/**").hasRole("MANAGER")
				.requestMatchers("/admin/**").hasRole("ADMIN")
				.anyRequest().permitAll()
		)
		.formLogin(Customizer.withDefaults());
		return http.build();
	}
}
