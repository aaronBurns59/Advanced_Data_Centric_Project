package com.sales.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sales.models.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>
{
	/* Do not need to manually implement anything here because the function findAll which is called
	 * in the CustomerRepository is contained in the CrudRepository interface
	 */
}// CustomerRepository
