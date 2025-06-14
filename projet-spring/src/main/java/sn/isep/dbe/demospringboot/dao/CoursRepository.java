package sn.isep.dbe.demospringboot.dao;

import sn.isep.dbe.demospringboot.models.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursRepository extends JpaRepository<Cours, Long> {
}