package com.example.WithoutView.Serviceimpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.WithoutView.Service.MobileService;
import com.example.WithoutView.exception.ResourceNotFoundException;
import com.example.WithoutView.model.Mobile;
import com.example.WithoutView.repository.MobileRepository;
@Service
public class MobileServiceImpl implements  MobileService{

	
	@Autowired
	private MobileRepository mrop;

	public MobileServiceImpl( MobileRepository mrop) {
		super();
		this.mrop=mrop;
	}

	@Override
	public Mobile saveMobile(Mobile mobile) {
		return mrop.save(mobile);
	}

	@Override
	public List<Mobile> getAllMobile() {
		return mrop.findAll();
	}

	@Override
	public Mobile getMobileById(long id) {
     Optional<Mobile> mobile=mrop.findById(id);
     if(mobile.isPresent())
     {
    	 return mrop.getOne(id);   
     
     } else {
	       throw new com.example.WithoutView.exception.ResourceNotFoundException("Mobile","Id",id);
          }
	
	}

	@Override
	public Mobile UpdateMobile(Mobile mobile, long id) {
       Mobile exitstingMobile=mrop.findById(id).orElseThrow ( 
    		   () -> new ResourceNotFoundException("Mobile","Id","id"));
       
       exitstingMobile.setCompany(mobile.getCompany());
       exitstingMobile.setModel(mobile.getModel());
       exitstingMobile.setPrice(mobile.getPrice());
       
       mrop.save(exitstingMobile);
		return exitstingMobile;
	}

	@Override
	public String DeleteMobile(String param) {
		List<Long> longIds = Stream.of(param.split(","))
                .map(Long::parseLong)
                .collect(Collectors.toList());
                String tmp105="";
            for(int i=0;i<longIds.size();i++) {
            	 if(mrop.existsById(longIds.get(i))) {
            		 tmp105=(tmp105+"delete succes");
            		 System.out.println();
            	 }
            	 else {
            		 tmp105=(tmp105+"not Avaliable");
            		 System.out.println();
            	 }
            }
		return tmp105;
		
	}

	@Override
	public List<Mobile> insertAllMobile( List<Mobile> m) {
		return mrop.saveAll(m);
	}

//	
	
	
	
}
