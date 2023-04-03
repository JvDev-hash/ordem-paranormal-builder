package op.encounter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import op.encounter.model.Enemy;

public interface EnemyRepository extends JpaRepository<Enemy, Long> {
    
    List<Enemy> findMonstersByType(String type);
}
