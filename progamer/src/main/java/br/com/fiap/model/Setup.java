package br.com.fiap.model;

import java.math.BigDecimal;

public class Setup {
	private String name = "Meu Setup";
	private String descricao = "descricao setup";
	private BigDecimal price = new BigDecimal(2000);

	
	
	
	@Override
	public String toString() {
		return "Setup [name=" + name + ", descricao=" + descricao + ", price=" + price + "]";
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
