package com.example.WithoutView.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.WithoutView.Service.MobileService;
import com.example.WithoutView.model.Mobile;

@RestController
@RequestMapping("/mobb")
public class MobileController {

	@Autowired
	private MobileService mService;

	public MobileController() {
		super();
		this.mService=mService;
	}
	
	@PostMapping()
	public ResponseEntity<Mobile> saveMobile(@RequestBody Mobile mobile){
		return new ResponseEntity<Mobile>(mService.saveMobile(mobile),HttpStatus.CREATED);
	}
	
	@GetMapping()
	public List<Mobile> getAllMobile(){
		return mService.getAllMobile();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Mobile> getMobileById(@PathVariable ("id") long MobileId) {
		return new ResponseEntity<Mobile>(mService.getMobileById(MobileId),HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Mobile> updateMobile(@PathVariable("id") long id ,
			                                       @RequestBody Mobile mobile){
		return new ResponseEntity<Mobile> (mService.UpdateMobile(mobile, id),HttpStatus.OK);
	}
	
	@DeleteMapping("{param}")
	public ResponseEntity<String> DeleteMobile(@PathVariable("param") String param){
	     String tmp81=mService.DeleteMobile(param);
		 return new ResponseEntity<String>(tmp81,HttpStatus.OK);
	}
	
	@PostMapping("/oo")
	public List<Mobile> insertAllMobile(@RequestBody List<Mobile>  m){
		return  mService.insertAllMobile(m);
	}
	
}
