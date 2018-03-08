package com.bytewheels.order.repository;

import com.bytewheels.order.dao.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BookingRepository extends JpaRepository<Booking, String> {
}
