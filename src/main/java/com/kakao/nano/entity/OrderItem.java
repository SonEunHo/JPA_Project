package com.kakao.nano.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class OrderItem extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "ORDER_ITEM_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name="ITEM_ID")
    private Item item;

    @ManyToOne
    @JoinColumn(name="ORDER_ID")
    private Order order;

    private int orderPrice;

    private int count;

    public void setItem(Item item) {
        this.item = item;
    }
}
