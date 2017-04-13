package com.sal.alba.Messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.sal.alba.Messenger.database.DatabaseClass;
import com.sal.alba.Messenger.model.Profile;

public class ProfileService {

	// fields ...
	private Map<String, Profile> profiles = DatabaseClass.getProfile();
	
	
	// constructor ...
	public ProfileService(){
		profiles.put("ProfileName", new Profile(1, "ProfileName", "FirstName", "LastName"));
		profiles.put("Sal. Alba.", new Profile(2, "Sal. Alba.", "Salem", "Albarudy"));
	}
	
	// methods ...
	public List<Profile> getAllProfiles(){ return new ArrayList<>(profiles.values()); }
	
	public Profile getProfile(String profileName){ return profiles.get(profileName); }
	
	public Profile addProfile(Profile profile){
		profile.setId(profiles.size()+1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile updateProfile(Profile profile){
		if(profile.getProfileName().isEmpty()) return null;
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile removeProfile(String profileName){
		return profiles.remove(profileName);
	}
	
	
}