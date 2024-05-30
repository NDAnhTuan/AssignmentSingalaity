package com.example.AssignmentSing.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Data
//@Builder
@Entity
//@AllArgsConstructor
//@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
public class Student {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column("idStudent")
    private int idStudent;
//    @Column("studentName")
    private String studentName;
//    @Column("schoolStart")
    private int schoolStart;
//    @Column("schoolEnd")
    private int schoolEnd;
}
