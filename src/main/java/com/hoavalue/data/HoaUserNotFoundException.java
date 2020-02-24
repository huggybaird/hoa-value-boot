package com.hoavalue.data;
public class HoaUserNotFoundException extends RuntimeException {

 public HoaUserNotFoundException(Long id) {
    super("Could not find user " + id);
  }
}