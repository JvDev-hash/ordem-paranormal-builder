package op.encounter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import op.encounter.model.Monster;

public interface MonsterRepository extends JpaRepository<Monster, Long> {
    
    List<Monster> findMonstersByType(String type);
}
