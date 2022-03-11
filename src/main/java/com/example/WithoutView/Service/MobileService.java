package com.example.WithoutView.Service;

import java.util.List;

import com.example.WithoutView.model.Mobile;

public interface MobileService {

	Mobile saveMobile(Mobile mobile);
	List<Mobile> getAllMobile();
	
    Mobile getMobileById(long id);
    
    Mobile UpdateMobile(Mobile mobile,long id);
    
    String DeleteMobile( String param);
    
    List<Mobile> insertAllMobile(List<Mobile> m);
}
