package kr.co.picTO.community.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BaseUserQnaRepo extends JpaRepository<BaseUserQna, Long> {

    Optional<BaseUserQna> findByEmail(String email);

    Optional<BaseUserQna> findByName(String name);
}
