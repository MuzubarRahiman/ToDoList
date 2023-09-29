package com.klu;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klu.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}