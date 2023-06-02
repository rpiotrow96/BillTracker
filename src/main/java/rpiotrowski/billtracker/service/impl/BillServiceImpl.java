package rpiotrowski.billtracker.service.impl;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import rpiotrowski.billtracker.entity.Bill;
import rpiotrowski.billtracker.repository.BillRepository;
import rpiotrowski.billtracker.service.BillService;

import java.util.List;

@Service
@Transactional
public class BillServiceImpl implements BillService {
    private final BillRepository billRepository;

    public BillServiceImpl(BillRepository billRepository) {
        this.billRepository = billRepository;
    }

    @Override
    public List<Bill> getAllBills() {
        return billRepository.findAll();
    }
}
