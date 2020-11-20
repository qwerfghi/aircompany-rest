package com.qwerfghi.aircompany.controller;

import com.qwerfghi.aircompany.entity.model.Migration;
import com.qwerfghi.aircompany.service.MigrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestController
@RequestMapping("/migrations")
public class MigrationController {

    private final MigrationService migrationService;

    @Autowired
    public MigrationController(MigrationService migrationService) {
        this.migrationService = migrationService;
    }

    @GetMapping("/{id}")
    public Migration getMigration(@PathVariable("id") int id) {
        return migrationService.getMigrationById(id)
                .orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Unable to find migration by specified migration id"));
    }

    @GetMapping
    public List<Migration> getMigrations() {
        return migrationService.getAllMigrations();
    }

    @PostMapping
    public void addMigration(@RequestBody Migration migration) {
        migrationService.addMigration(migration);
    }

    @DeleteMapping("/{id}")
    public void deleteMigration(@PathVariable("id") int id) {
        migrationService.deleteMigration(id);
    }

    @PutMapping("/{id}")
    public void updateMigration(@PathVariable("id") int id, @RequestBody Migration migration) {
        migration.setMigrationId(id);
        migrationService.updateMigration(migration);
    }
}
