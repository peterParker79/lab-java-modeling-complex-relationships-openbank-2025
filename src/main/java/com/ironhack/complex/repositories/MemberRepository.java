package com.ironhack.complex.repositories;

import com.ironhack.complex.models.Conference;
import com.ironhack.complex.models.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository <Member, Integer> {
}
