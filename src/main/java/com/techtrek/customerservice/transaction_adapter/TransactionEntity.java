package com.techtrek.customerservice.transaction_adapter;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table
public class TransactionEntity {
    @Id
    private String transactionId;
    private String customerId;
    private String toAccountId;
    private String fromAccountId;
    private double amount;
    private LocalDateTime localDateTime;
    //Who added the Transaction
    private String authenticationId;
}
