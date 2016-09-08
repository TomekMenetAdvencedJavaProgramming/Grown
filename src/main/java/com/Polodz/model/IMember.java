package com.Polodz.model;

import java.util.List;

public interface IMember {

	public Integer getId();
	
    void setName(String bscName);

    List<? extends IItem> getItems();

    List<? super Movie> addItems();

    String getName();

    void setItems(List<IItem> newBasket);

}
