package rpiotrowski.billtracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import rpiotrowski.billtracker.entity.Bill;
import rpiotrowski.billtracker.service.BillService;

import java.util.List;

@Controller
public class BillController {
    private final BillService billService;

    @Autowired
    public BillController(BillService billService) {
        this.billService = billService;
    }

    @GetMapping ("/bills")
    public String getBills(Model model) {
        model.addAttribute("bills", billService.getAllBills());
        return "bills";
    }
}
