package org.hibernate.tutorial.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;

@NamedQueries(
		{
			@NamedQuery(name = "findStudentByID2", query = "from Student3 st where st.studentId = :studentId") ,
			@NamedQuery(name = "findStudentByID0", query = "from Student3")
		})

@NamedNativeQueries(
		{ 
			@NamedNativeQuery(name = "findStudentByID3", query = "select * from student3 s where s.STUDENT_ID = :studentId", resultClass = Student3.class) 
		})
@FilterDef(
		name = "studentFilter", 
		parameters = @ParamDef(name = "studentFilterID", type = "java.lang.Integer")
		)
@Entity
@Table(name = "student3", catalog = "loglocal")
public class Student3 implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer studentId;
	private String studentName;
	private String studentAge;

	public Student3() {
	}

	public Student3(String studentName, String studentAge) {
		this.studentName = studentName;
		this.studentAge = studentAge;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "STUDENT_ID", unique = true, nullable = false)
	public Integer getStudentId() {
		return this.studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	@Column(name = "STUDENT_NAME", nullable = false, length = 10)
	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Column(name = "STUDENT_AGE", nullable = false, length = 20)
	public String getStudentAge() {
		return this.studentAge;
	}

	public void setStudentAge(String studentAge) {
		this.studentAge = studentAge;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName="
				+ studentName + ", studentAge=" + studentAge + "]";
	}

}
/*
@Entity declares the class as an entity (i.e. a persistent POJO class)
@Table is set at the class level; it allows you to define the table, catalog, and schema names for your entity mapping. If no @Table is defined the default values are used: the unqualified class name of the entity.
@Id declares the identifier property of this entity.
@GeneratedValue annotation is used to specify the primary key generation strategy to use. If the strategy is not specified by default AUTO will be used.
@Column annotation is used to specify the details of the column to which a field or property will be mapped. If the @Column annotation is not specified by default the property name will be used as the column name.
*/