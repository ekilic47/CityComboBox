package center;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.model.SelectItem;

@ManagedBean(name = "user")
@SessionScoped

public class RegUserInfoBean {
	private String state;
	private String city;
	private ArrayList<String> stateList;
	private ArrayList<String> cityList = new ArrayList<String>();

	private enum stateKeys {
		England, Turkey, Italy
	};


	@PostConstruct
	public void init() {
		stateList = new ArrayList<String>();
		stateList.add("England");
		stateList.add("Turkey");
		stateList.add("Italy");
	}

	public void cityListener() {
		switch (stateKeys.valueOf(state)) {
		case England:
			cityList.clear();
			cityList.add("London");
			cityList.add("Manchester");
			cityList.add("Newcasthle");
			break;
		case Turkey:
			cityList.clear();
			cityList.add("Cankiri");
			cityList.add("Corum");
			cityList.add("Yozgat");
			break;
		case Italy:
			cityList.clear();
			cityList.add("Rome");
			cityList.add("Milano");
			cityList.add("Catania");
			break;

		}

	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public ArrayList<String> getStateList() {
		return stateList;
	}

	public void setStateList(ArrayList<String> stateList) {
		this.stateList = stateList;
	}

	public ArrayList<String> getCityList() {
		return cityList;
	}

	public void setCityList(ArrayList<String> cityList) {
		this.cityList = cityList;
	}

}