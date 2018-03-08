package com.bytewheels.order.repository;

import com.bytewheels.order.dao.Booking;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BookingRepository extends PagingAndSortingRepository<Booking, String> {
}
