package com.example.Sql_Rocks;


import jakarta.persistence.*;

@Entity
@Table(name = "Library_Card")
public class LibraryCard
{
   @Id

   private int cardNo;

   private int fine;

   private int BooksIssued;

   @Enumerated(value = EnumType.STRING) // To store values in db in String format

   private CardStatus cardStatus;

   // child class will have a foreign key of parent class : through which it
   // connects to other tables

   @OneToOne // mapping relation b/w two entity
   @JoinColumn // you are telling : add a foriegn key column --> define a column name of parent class, by default its primay key of parent class

   User user;
}
