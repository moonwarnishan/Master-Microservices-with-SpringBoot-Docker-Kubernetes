package com.eazybytes.accounts.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Accounts extends BaseEntity {
    @Column(name = "customer_id")
    private Long customerId;

    @Id
    @Column(name = "account_number")
    private Long accountNumber;
    @Column(name = "account_type")
    private String accountType;
    @Column(name = "mobile_number")
    private String mobileNumber;
    @Column(name = "branch_address")
    private String branchAddress;
}
