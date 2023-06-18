package com.skilldistillery.jpamageadventure.data;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
@Transactional
public class UserDAOImpl {

	@PersistenceContext
	private EntityManager em;
}
