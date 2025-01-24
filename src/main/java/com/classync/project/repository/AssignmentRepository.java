package com.classync.project.repository;

import com.classync.project.entity.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
    // List<Assignment> findByCourseClassId(Long classId);
}
