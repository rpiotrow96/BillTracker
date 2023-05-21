package rpiotrowski.billtracker.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class PaymentDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String companyName;
    private String accountNumber;
}
