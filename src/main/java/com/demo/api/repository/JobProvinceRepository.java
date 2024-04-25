package com.demo.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.api.entity.jpa.JobProvince;

public interface JobProvinceRepository extends CrudRepository<JobProvince, Integer> {
}
