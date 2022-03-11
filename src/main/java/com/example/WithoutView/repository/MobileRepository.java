package com.example.WithoutView.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.WithoutView.model.Mobile;

@Repository
public interface MobileRepository extends JpaRepository<Mobile,Long>{

}
