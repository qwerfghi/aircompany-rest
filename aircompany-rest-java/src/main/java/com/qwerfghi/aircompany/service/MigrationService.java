package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.entity.model.Migration;
import com.qwerfghi.aircompany.repository.MigrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class MigrationService {

    private final MigrationRepository migrationRepository;

    @Autowired
    public MigrationService(MigrationRepository migrationRepository) {
        this.migrationRepository = migrationRepository;
    }

    @Transactional(readOnly = true)
    public Optional<Migration> getMigrationById(int id) {
        return migrationRepository.findById(id);
    }

    @Transactional(readOnly = true)
    public List<Migration> getAllMigrations() {
        return migrationRepository.findAll();
    }

    public void addMigration(Migration migration) {
        migrationRepository.save(migration);
    }

    public void deleteMigration(int id) {
        migrationRepository.deleteById(id);
    }

    public void updateMigration(Migration migration) {
        migrationRepository.save(migration);
    }
}
