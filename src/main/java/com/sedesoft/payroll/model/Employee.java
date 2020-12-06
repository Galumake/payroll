package com.sedesoft.payroll.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee") 
public class Employee {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String id_card;
	private String firt_name;
	private String last_name;
	private String second_surname;
	private String birth_date;
	private String gender;
	private String civil_status;
	private String nationality;
	private Integer age;
	private String educational_formation;
	private String email;
	private String cell_phone;
	private String phone;
	private String job_contact_name;
	private String job_contact_phone;
	private String health_condition;
	private String observations;
	private String agreement_date;
	private String agreement_type;
	private String agreement_status;
	private String agreement_end_date;
	private String headquarters;
	private String job_title;
	private String department;
	private String payment_period;
	private String payment_method;
	private String currency;
	private String bank;
	private String iban;
	private String working_day;
	private String working_hours;
	private String business_days;
	private String cost_per_hour;
	private String cost_overtime;
	private String cost_double_overtime;
	private String cost_per_day;
	private String bonus_mount;
	private String bonus_cellphone;
	private String bonus_transportation;
	private String security_contribution_type;
	private String security_contribution_amount;
	private String net_salary;
	private String gross_salary;
		
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getId_card() {
		return id_card;
	}

	public void setId_card(String id_card) {
		this.id_card = id_card;
	}

	public String getFirt_name() {
		return firt_name;
	}

	public void setFirt_name(String firt_name) {
		this.firt_name = firt_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getSecond_surname() {
		return second_surname;
	}

	public void setSecond_surname(String second_surname) {
		this.second_surname = second_surname;
	}

	public String getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCivil_status() {
		return civil_status;
	}

	public void setCivil_status(String civil_status) {
		this.civil_status = civil_status;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEducational_formation() {
		return educational_formation;
	}

	public void setEducational_formation(String educational_formation) {
		this.educational_formation = educational_formation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCell_phone() {
		return cell_phone;
	}

	public void setCell_phone(String cell_phone) {
		this.cell_phone = cell_phone;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getJob_contact_name() {
		return job_contact_name;
	}

	public void setJob_contact_name(String job_contact_name) {
		this.job_contact_name = job_contact_name;
	}

	public String getJob_contact_phone() {
		return job_contact_phone;
	}

	public void setJob_contact_phone(String job_contact_phone) {
		this.job_contact_phone = job_contact_phone;
	}

	public String getHealth_condition() {
		return health_condition;
	}

	public void setHealth_condition(String health_condition) {
		this.health_condition = health_condition;
	}

	public String getObservations() {
		return observations;
	}

	public void setObservations(String observations) {
		this.observations = observations;
	}

	public String getAgreement_date() {
		return agreement_date;
	}

	public void setAgreement_date(String agreement_date) {
		this.agreement_date = agreement_date;
	}

	public String getAgreement_type() {
		return agreement_type;
	}

	public void setAgreement_type(String agreement_type) {
		this.agreement_type = agreement_type;
	}

	public String getAgreement_status() {
		return agreement_status;
	}

	public void setAgreement_status(String agreement_status) {
		this.agreement_status = agreement_status;
	}

	public String getAgreement_end_date() {
		return agreement_end_date;
	}

	public void setAgreement_end_date(String agreement_end_date) {
		this.agreement_end_date = agreement_end_date;
	}

	public String getHeadquarters() {
		return headquarters;
	}

	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPayment_period() {
		return payment_period;
	}

	public void setPayment_period(String payment_period) {
		this.payment_period = payment_period;
	}

	public String getPayment_method() {
		return payment_method;
	}

	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getWorking_day() {
		return working_day;
	}

	public void setWorking_day(String working_day) {
		this.working_day = working_day;
	}

	public String getWorking_hours() {
		return working_hours;
	}

	public void setWorking_hours(String working_hours) {
		this.working_hours = working_hours;
	}

	public String getBusiness_days() {
		return business_days;
	}

	public void setBusiness_days(String business_days) {
		this.business_days = business_days;
	}

	public String getCost_per_hour() {
		return cost_per_hour;
	}

	public void setCost_per_hour(String cost_per_hour) {
		this.cost_per_hour = cost_per_hour;
	}

	public String getCost_overtime() {
		return cost_overtime;
	}

	public void setCost_overtime(String cost_overtime) {
		this.cost_overtime = cost_overtime;
	}

	public String getCost_double_overtime() {
		return cost_double_overtime;
	}

	public void setCost_double_overtime(String cost_double_overtime) {
		this.cost_double_overtime = cost_double_overtime;
	}

	public String getCost_per_day() {
		return cost_per_day;
	}

	public void setCost_per_day(String cost_per_day) {
		this.cost_per_day = cost_per_day;
	}

	public String getBonus_mount() {
		return bonus_mount;
	}

	public void setBonus_mount(String bonus_mount) {
		this.bonus_mount = bonus_mount;
	}

	public String getBonus_cellphone() {
		return bonus_cellphone;
	}

	public void setBonus_cellphone(String bonus_cellphone) {
		this.bonus_cellphone = bonus_cellphone;
	}

	public String getBonus_transportation() {
		return bonus_transportation;
	}

	public void setBonus_transportation(String bonus_transportation) {
		this.bonus_transportation = bonus_transportation;
	}

	public String getSecurity_contribution_type() {
		return security_contribution_type;
	}

	public void setSecurity_contribution_type(String security_contribution_type) {
		this.security_contribution_type = security_contribution_type;
	}

	public String getSecurity_contribution_amount() {
		return security_contribution_amount;
	}

	public void setSecurity_contribution_amount(String security_contribution_amount) {
		this.security_contribution_amount = security_contribution_amount;
	}

	public String getNet_salary() {
		return net_salary;
	}

	public void setNet_salary(String net_salary) {
		this.net_salary = net_salary;
	}

	public String getGross_salary() {
		return gross_salary;
	}

	public void setGross_salary(String gross_salary) {
		this.gross_salary = gross_salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", id_card=" + id_card + ", firt_name=" + firt_name + ", last_name=" + last_name
				+ ", second_surname=" + second_surname + ", birth_date=" + birth_date + ", gender=" + gender
				+ ", civil_status=" + civil_status + ", nationality=" + nationality + ", age=" + age
				+ ", educational_formation=" + educational_formation + ", email=" + email + ", cell_phone=" + cell_phone
				+ ", phone=" + phone + ", job_contact_name=" + job_contact_name + ", job_contact_phone="
				+ job_contact_phone + ", health_condition=" + health_condition + ", observations=" + observations
				+ ", agreement_date=" + agreement_date + ", agreement_type=" + agreement_type + ", agreement_status="
				+ agreement_status + ", agreement_end_date=" + agreement_end_date + ", headquarters=" + headquarters
				+ ", job_title=" + job_title + ", department=" + department + ", payment_period=" + payment_period
				+ ", payment_method=" + payment_method + ", currency=" + currency + ", bank=" + bank + ", iban=" + iban
				+ ", working_day=" + working_day + ", working_hours=" + working_hours + ", business_days="
				+ business_days + ", cost_per_hour=" + cost_per_hour + ", cost_overtime=" + cost_overtime
				+ ", cost_double_overtime=" + cost_double_overtime + ", cost_per_day=" + cost_per_day + ", bonus_mount="
				+ bonus_mount + ", bonus_cellphone=" + bonus_cellphone + ", bonus_transportation="
				+ bonus_transportation + ", security_contribution_type=" + security_contribution_type
				+ ", security_contribution_amount=" + security_contribution_amount + ", net_salary=" + net_salary
				+ ", gross_salary=" + gross_salary + "]";
	}

	
		
	
}
