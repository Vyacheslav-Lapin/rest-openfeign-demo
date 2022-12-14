package ru.vlapin.demo.restopenfeigndemo.controller.jsonplaceholder;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vlapin.demo.restopenfeigndemo.model.jsonplaceholder.User;
import ru.vlapin.demo.restopenfeigndemo.service.jsonplaceholder.UserService;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/users")
public class UserController {

  UserService userService;

  @NotNull
  @GetMapping
//  @Contract(pure = true)
  public List<User> all() {
    return userService.all();
  }

//  @NotNull
  @GetMapping("{id}")
//  @Contract(pure = true)
  public User byId(@PathVariable @NotNull Long id) {
    return userService.findById(id).getBody();
  }
}
