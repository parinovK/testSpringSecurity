package ru.parinov.testSpringSecurity.repository;

import ru.parinov.testSpringSecurity.model.ApplicationEntity;

import java.util.List;

public interface AppRepository {
    void loadAppInDB();
    List<ApplicationEntity> allApps();
    ApplicationEntity ApplicationByID(long id);
}
