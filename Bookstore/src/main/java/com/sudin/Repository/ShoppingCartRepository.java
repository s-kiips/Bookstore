package com.sudin.Repository;


import com.sudin.Domain.ShoppingCart;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by s-k-ii-p-s on 9/1/17.
 */
public interface ShoppingCartRepository extends CrudRepository<ShoppingCart,Long> {
}
