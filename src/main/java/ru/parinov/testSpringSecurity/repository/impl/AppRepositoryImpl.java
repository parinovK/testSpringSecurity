package ru.parinov.testSpringSecurity.repository.impl;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Repository;
import ru.parinov.testSpringSecurity.model.ApplicationEntity;
import ru.parinov.testSpringSecurity.repository.AppRepository;

import java.util.List;
import java.util.stream.IntStream;

@Repository
public class AppRepositoryImpl implements AppRepository {
    private List<ApplicationEntity> apps;
    @Override
    public void loadAppInDB() {
        Faker faker = new Faker();
        apps = IntStream.rangeClosed(1,100).mapToObj(element -> ApplicationEntity.builder()
                        .id((long) element)
                        .name(faker.app().name())
                        .author(faker.app().author())
                        .version(faker.app().version())
                        .build())
                .toList();
    }

    @Override
    public List<ApplicationEntity> allApps() {
        return apps;
    }

    @Override
    public ApplicationEntity ApplicationByID(long id) {
        return apps.stream()
                .filter( element -> element.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
