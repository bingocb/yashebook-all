package com.yashebook.repository;

import com.yashebook.entity.UserAddress;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by binchen on 2017/12/26.
 */
public abstract class UserAddressRepository implements JpaRepository<UserAddress, Long>{
}
