package br.com.rodrigues.springcrudauth.model;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Users Repository
 */
public interface Users extends MongoRepository<User, Long>{

}