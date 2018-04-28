package com.qwerfghi.aircompany.controller;

import com.qwerfghi.aircompany.entity.model.Migration;
import com.qwerfghi.aircompany.service.MigrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class MigrationController {
    private final MigrationService migrationService;

    @Autowired
    public MigrationController(MigrationService migrationService) {
        this.migrationService = migrationService;
    }

    @GetMapping("/{id}")
    public Migration getMigration(@PathVariable("id") int id) {
        return migrationService.getMigrationById(id);
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

    @PutMapping
    public void updateMigration(@RequestBody Migration migration) {
        migrationService.updateMigration(migration);
    }
}
