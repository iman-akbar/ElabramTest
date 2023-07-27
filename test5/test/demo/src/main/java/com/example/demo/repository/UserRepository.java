package com.example.demo.repository;

import com.example.demo.model.PaymentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<PaymentModel,String> {
    @Query(value = "select * from Payment" , nativeQuery = true)
    List<PaymentModel> getPayment();
}
