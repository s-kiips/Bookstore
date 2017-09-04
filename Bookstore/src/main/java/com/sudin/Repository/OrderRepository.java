package com.sudin.Repository;

import com.sudin.Domain.Order;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by s-k-ii-p-s on 9/4/17.
 */
public interface OrderRepository extends CrudRepository<Order,Long> {
}
