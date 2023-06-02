package rpiotrowski.billtracker.service;

import rpiotrowski.billtracker.entity.Bill;

import java.util.List;

public interface BillService {
    List<Bill> getAllBills();
}
