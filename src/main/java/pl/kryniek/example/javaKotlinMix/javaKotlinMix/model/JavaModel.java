package pl.kryniek.example.javaKotlinMix.javaKotlinMix.model;

import java.math.BigDecimal;
import java.util.Date;

public class JavaModel {
	private Integer id;
	private String name;
	private String surname;
	private BigDecimal somethingShit;
	private Date someDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public BigDecimal getSomethingShit() {
		return somethingShit;
	}

	public void setSomethingShit(BigDecimal somethingShit) {
		this.somethingShit = somethingShit;
	}

	public Date getSomeDate() {
		return someDate;
	}

	public void setSomeDate(Date someDate) {
		this.someDate = someDate;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		JavaModel javaModel = (JavaModel) o;

		if (id != null ? !id.equals(javaModel.id) : javaModel.id != null) return false;
		if (name != null ? !name.equals(javaModel.name) : javaModel.name != null) return false;
		if (surname != null ? !surname.equals(javaModel.surname) : javaModel.surname != null) return false;
		if (somethingShit != null ? !somethingShit.equals(javaModel.somethingShit) : javaModel.somethingShit != null)
			return false;
		return someDate != null ? someDate.equals(javaModel.someDate) : javaModel.someDate == null;
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (surname != null ? surname.hashCode() : 0);
		result = 31 * result + (somethingShit != null ? somethingShit.hashCode() : 0);
		result = 31 * result + (someDate != null ? someDate.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "JavaModel{" +
				"id=" + id +
				", name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", somethingShit=" + somethingShit +
				", someDate=" + someDate +
				'}';
	}
}
