package rpiotrowski.billtracker.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rpiotrowski.billtracker.entity.Bill;

@Repository
@Transactional
public interface BillRepository extends JpaRepository<Bill, Long> {
}
