package com.demo.api.service;

import java.util.Optional;

import com.demo.api.dto.in.PageDtoIn;
import com.demo.api.dto.out.EmployerDtoOut;
import com.demo.api.dto.out.PageDtoOut;
import com.demo.api.entity.jpa.Employer;

public interface EmployerService {
  PageDtoOut<EmployerDtoOut> list(PageDtoIn pageDtoIn);
  EmployerDtoOut get(Long id);
  Optional<Employer> getByName(String name);
  Employer add(Employer item);
  Employer update(Long id, Employer updateItem);
  void delete(Long id);
}
