package edu.mum.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotEmpty;

import edu.mum.validation.EmptyOrSize;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
 	private Long id;

	@EmptyOrSize(min = 1, max = 50, message = "{EmptyOrSize}")
	String name;
	
	@NotEmpty
	String description;

	@OneToMany(mappedBy = "category", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval=true)
	Set<Product> products = new HashSet<Product>();

	public Category() {
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Product> getItems() {
		return products;
	}

	public void setItems(Set<Product> products) {
		this.products = products;
	}

	public void addItem(Product product) {
		this.products.add(product);

	}
}
