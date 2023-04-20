package br.com.rodrigues.springcrudauth.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rodrigues.springcrudauth.model.User;
import br.com.rodrigues.springcrudauth.model.Users;

/**
 * UserController
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private Users users;

    // @GetMapping
    // public User findById(@PathVariable User id) {
    //   // return users.findOne(id);
    // }

    @GetMapping
    public List<User> pesquisar() {
      return users.findAll();
    }
     
    @PostMapping
    public User salvar(@RequestBody User user) {
      return users.save(user);
    }
   
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable User id) {
      users.delete(id);
    }
}