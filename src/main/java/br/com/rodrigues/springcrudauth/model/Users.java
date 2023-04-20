package br.com.rodrigues.springcrudauth.model;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Users Repository
 */
public interface Users extends JpaRepository<User, Long>{

}