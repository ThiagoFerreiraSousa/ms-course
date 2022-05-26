package com.tfs.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.tfs.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPaymant(long workId, int days) {
		return new Payment("Bob", 200.00, days);
	}

}
