package com.tfs.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tfs.hrpayroll.entities.Payment;
import com.tfs.hrpayroll.entities.Worker;
import com.tfs.hrpayroll.feignclientes.WorkerFeignClient;

@Service
public class PaymentService {

	@Autowired
	private WorkerFeignClient workerFeignClient;

	public Payment getPaymant(long workerId, int days) {

		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}

}
