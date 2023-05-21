package rpiotrowski.billtracker.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;

@Entity
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String paymentTitle;
    private int paymentValue;
    private String paymentDate;
    @Column(nullable = true)
    int frequency;
    String dateTo;
    @ManyToOne
    PaymentDetails paymentDetails;
}
