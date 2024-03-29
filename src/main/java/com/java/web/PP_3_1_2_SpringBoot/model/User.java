package com.java.web.PP_3_1_2_SpringBoot.model;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class User {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
   private String userName;
   private String firstName;
   private String lastName;

   public long getId() {
      return id;
   }

   public void setId(long id) {
      this.id = id;
   }

   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }
}