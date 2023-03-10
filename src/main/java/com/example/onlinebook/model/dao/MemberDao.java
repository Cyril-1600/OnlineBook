package com.example.onlinebook.model.dao;

import com.example.onlinebook.model.entity.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberDao extends CrudRepository<Member, String> {
}
