package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.entity.dto.MigrationDTO;
import com.qwerfghi.aircompany.repository.dto.MigrationDTORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MigrationService {
    private final MigrationDTORepository migrationDTORepository;

    @Autowired
    public MigrationService(MigrationDTORepository migrationDTORepository) {
        this.migrationDTORepository = migrationDTORepository;
    }

    @Transactional(readOnly = true)
    public MigrationDTO getMigrationById(int id) {
        return migrationDTORepository.findOne(id);
    }

    @Transactional(readOnly = true)
    public List<MigrationDTO> getAllMigrations() {
        return migrationDTORepository.findAll();
    }

    public void addMigration(MigrationDTO migrationDTO) {
        migrationDTORepository.save(migrationDTO);
    }

    public void deleteMigration(int id) {
        migrationDTORepository.delete(id);
    }

    public void updateMigration(MigrationDTO migrationDTO) {
        migrationDTORepository.save(migrationDTO);
    }
}
