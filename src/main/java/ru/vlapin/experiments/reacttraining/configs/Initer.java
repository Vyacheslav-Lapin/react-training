package ru.vlapin.experiments.reacttraining.configs;

import java.util.stream.Stream;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import ru.vlapin.experiments.reacttraining.dao.CatRepository;
import ru.vlapin.experiments.reacttraining.model.Cat;

@Component
@RequiredArgsConstructor
public class Initer implements ApplicationRunner {

  CatRepository catRepository;

  @Override
  public void run(ApplicationArguments args) {
    Stream.of("Барсик", "Мурзик", "Машка")
        .map(Cat::new)
        .forEach(catRepository::save);
  }
}
