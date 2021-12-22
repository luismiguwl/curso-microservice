package com.luis.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luis.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
