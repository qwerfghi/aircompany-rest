package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.repository.MigrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MigrationService {
    private final MigrationRepository migrationRepository;

    @Autowired
    public MigrationService(MigrationRepository migrationRepository) {
        this.migrationRepository = migrationRepository;
    }

    @Transactional(readOnly = true)
    public MigrationDTO getMigrationById(int id) {
        return migrationRepository.findOne(id);
    }

    @Transactional(readOnly = true)
    public List<MigrationDTO> getAllMigrations() {
        return migrationRepository.findAll();
    }

    public void addMigration(MigrationDTO migrationDTO) {
        migrationRepository.save(migrationDTO);
    }

    public void deleteMigration(int id) {
        migrationRepository.delete(id);
    }

    public void updateMigration(MigrationDTO migrationDTO) {
        migrationRepository.save(migrationDTO);
    }
}
