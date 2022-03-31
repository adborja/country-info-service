package com.modusbox.employee.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Employee
 */
public class Employee {
  private String id = null;
  private String name = null;
  private String lastName = null;
  private String fullName = null;
  private String designation = null;
  private Amount salaryPerYear = null;
  private Amount salaryPerMonth = null;
  private Integer languagesCount = null;
  private List<String> languages = null;

  public Employee id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Employee name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Employee lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Employee fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public Employee designation(String designation) {
    this.designation = designation;
    return this;
  }

   /**
   * Get designation
   * @return designation
  **/
  public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  public Employee salaryPerYear(Amount salaryPerYear) {
    this.salaryPerYear = salaryPerYear;
    return this;
  }

   /**
   * Get salaryPerYear
   * @return salaryPerYear
  **/
  public Amount getSalaryPerYear() {
    return salaryPerYear;
  }

  public void setSalaryPerYear(Amount salaryPerYear) {
    this.salaryPerYear = salaryPerYear;
  }

  public Employee salaryPerMonth(Amount salaryPerMonth) {
    this.salaryPerMonth = salaryPerMonth;
    return this;
  }

   /**
   * Get salaryPerMonth
   * @return salaryPerMonth
  **/
  public Amount getSalaryPerMonth() {
    return salaryPerMonth;
  }

  public void setSalaryPerMonth(Amount salaryPerMonth) {
    this.salaryPerMonth = salaryPerMonth;
  }

  public Employee languagesCount(Integer languagesCount) {
    this.languagesCount = languagesCount;
    return this;
  }

   /**
   * Get languagesCount
   * @return languagesCount
  **/
  public Integer getLanguagesCount() {
    return languagesCount;
  }

  public void setLanguagesCount(Integer languagesCount) {
    this.languagesCount = languagesCount;
  }

  public Employee languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public Employee addLanguagesItem(String languagesItem) {
    if (this.languages == null) {
      this.languages = new ArrayList<String>();
    }
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * Programming languages and skills
   * @return languages
  **/
  public List<String> getLanguages() {
    return languages;
  }

  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employee employee = (Employee) o;
    return Objects.equals(this.id, employee.id) &&
        Objects.equals(this.name, employee.name) &&
        Objects.equals(this.lastName, employee.lastName) &&
        Objects.equals(this.fullName, employee.fullName) &&
        Objects.equals(this.designation, employee.designation) &&
        Objects.equals(this.salaryPerYear, employee.salaryPerYear) &&
        Objects.equals(this.salaryPerMonth, employee.salaryPerMonth) &&
        Objects.equals(this.languagesCount, employee.languagesCount) &&
        Objects.equals(this.languages, employee.languages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, lastName, fullName, designation, salaryPerYear, salaryPerMonth, languagesCount, languages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Employee {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    designation: ").append(toIndentedString(designation)).append("\n");
    sb.append("    salaryPerYear: ").append(toIndentedString(salaryPerYear)).append("\n");
    sb.append("    salaryPerMonth: ").append(toIndentedString(salaryPerMonth)).append("\n");
    sb.append("    languagesCount: ").append(toIndentedString(languagesCount)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
