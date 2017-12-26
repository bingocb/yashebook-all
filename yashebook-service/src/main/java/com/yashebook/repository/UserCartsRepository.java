package com.yashebook.repository;

import com.yashebook.entity.UserCarts;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by binchen on 2017/12/26.
 */
public abstract class UserCartsRepository implements JpaRepository<UserCarts, Long>{
}
