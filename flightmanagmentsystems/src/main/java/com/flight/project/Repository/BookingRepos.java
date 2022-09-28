package com.flight.project.Repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flight.project.dto.Booking;
@Repository

public interface BookingRepos extends JpaRepository<Booking,BigInteger> {

}
