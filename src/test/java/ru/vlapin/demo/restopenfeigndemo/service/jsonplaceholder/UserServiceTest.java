package ru.vlapin.demo.restopenfeigndemo.service.jsonplaceholder;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import ru.vlapin.demo.restopenfeigndemo.model.jsonplaceholder.Address;
import ru.vlapin.demo.restopenfeigndemo.model.jsonplaceholder.Geo;
import ru.vlapin.demo.restopenfeigndemo.model.jsonplaceholder.User;

import static org.assertj.core.api.Assertions.*;
import static org.springframework.http.HttpStatus.*;

@SpringBootTest
@RequiredArgsConstructor(onConstructor_ = @Autowired)
class UserServiceTest {

  UserService userService;

  @Test
  @SneakyThrows
  @DisplayName("User service works correctly")
  void userServiceWorksCorrectlyTest() {
    assertThat(userService.findById(10L)).isNotNull()
        .matches(HttpEntity::hasBody)
        .matches(userResponseEntity -> userResponseEntity.getStatusCode().equals(OK))
        .extracting(HttpEntity::getBody)
        .extracting(User::getAddress)
        .extracting(Address::getGeo)
        .extracting(Geo::getLatitude, Geo::getLongitude)
        .contains(-38.2386, 57.2232);
  }
}
