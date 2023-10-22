package com.aninfo.service;

import com.aninfo.model.Transaction;
import com.aninfo.repository.TransactionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction createTransaction(Transaction transaction) { return transactionRepository.save(transaction); }

    public List<Transaction> getAllTransactionsByCbu(Long cbu) { return transactionRepository.findTransactionsByCbu(cbu); }

    public Optional<Transaction> findById(Long id) {
        return transactionRepository.findById(id);
    }

    public void deleteById(Long id) { transactionRepository.deleteById(id); }

}
