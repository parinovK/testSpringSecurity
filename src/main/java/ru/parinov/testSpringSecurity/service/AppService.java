package ru.parinov.testSpringSecurity.service;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.parinov.testSpringSecurity.model.ApplicationEntity;
import ru.parinov.testSpringSecurity.repository.AppRepository;

import java.util.List;
@Service
@RequiredArgsConstructor
public class AppService {
    private final AppRepository repository;
    @PostConstruct
    public void loadAppInDB(){
        repository.loadAppInDB();
    }

    public List<ApplicationEntity> allApps(){
        return repository.allApps();
    }

    public ApplicationEntity ApplicationByID(long id){
        return repository.ApplicationByID(id);
    }
}
