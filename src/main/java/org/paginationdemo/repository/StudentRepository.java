package org.paginationdemo.repository;

import org.paginationdemo.domain.Student;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {

}
