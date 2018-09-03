package io.romeh.postgresembeddeddaotesting.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import io.romeh.postgresembeddeddaotesting.domain.Customer;

/**
 * main customer repository
 */
@Repository
@Transactional
public interface CustomerRepository extends CrudRepository<Customer, Long> {

	Optional<Customer> findCustomerByName(String name);
}
