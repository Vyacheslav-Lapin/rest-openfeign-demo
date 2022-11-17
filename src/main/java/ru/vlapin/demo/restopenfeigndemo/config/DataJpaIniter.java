package ru.vlapin.demo.restopenfeigndemo.config;

import java.util.stream.Stream;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import ru.vlapin.demo.restopenfeigndemo.dao.CatRepository;
import ru.vlapin.demo.restopenfeigndemo.model.Cat;

@Component
@RequiredArgsConstructor
public class DataJpaIniter implements ApplicationRunner {

  CatRepository catRepository;

  @Override
  public void run(ApplicationArguments __) {
    Stream.of("Мурзик, Барсик, Матроскин".split(", "))
        .map(Cat::new)
        .forEach(catRepository::save);
  }
}
