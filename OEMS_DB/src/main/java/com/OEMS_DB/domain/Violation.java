package com.OEMS_DB.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Violation {

	private int ID;
	private String spotCheckNum;
	private boolean dmv;
	private boolean crewCert;
	private boolean fireExt;
	private boolean exhaust;
	private boolean gaskets;
	private boolean windshield;
	private boolean acHeat;
	private boolean tires;
	private boolean crashworthy;
	private boolean portOx;
	private boolean obOx;
	private boolean portSuction;
	private boolean obSuction;
	private boolean stretcher;
	private boolean alsEquip;
	private boolean vehMarks;
	private boolean aed;
	private boolean radio;
	private boolean oxRetent;
	private boolean airbag;
	private boolean smoking;
	private boolean latches;
	private boolean bbp;
	private boolean lift;
	private boolean unsVeh;
	private boolean uniform;
	private boolean expMeds;
	private boolean reqEquip;
	private boolean licPlate;
	private boolean other;
	private String specOther;
	private boolean warning;
	private String entryBy;
	private String entryDate;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getID() 
	{
		return ID;
	}
	
	public void setID(int iD) 
	{
		ID = iD;
	}
	
	public String getSpotCheckNum() 
	{
		return spotCheckNum;
	}
	
	public void setSpotCheckNum(String spotCheckNum) 
	{
		this.spotCheckNum = spotCheckNum;
	}
	
	public boolean isDmv() 
	{
		return dmv;
	}
	
	public void setDmv(boolean dmv) 
	{
		this.dmv = dmv;
	}
	
	public boolean isCrewCert() 
	{
		return crewCert;
	}
	
	public void setCrewCert(boolean crewCert) 
	{
		this.crewCert = crewCert;
	}
	
	public boolean isFireExt() 
	{
		return fireExt;
	}
	
	public void setFireExt(boolean fireExt) 
	{
		this.fireExt = fireExt;
	}
	
	public boolean isExhaust() 
	{
		return exhaust;
	}
	
	public void setExhaust(boolean exhaust) 
	{
		this.exhaust = exhaust;
	}
	
	public boolean isGaskets() 
	{
		return gaskets;
	}
	
	public void setGaskets(boolean gaskets) 
	{
		this.gaskets = gaskets;
	}
	
	public boolean isWindshield() 
	{
		return windshield;
	}
	
	public void setWindshield(boolean windshield) 
	{
		this.windshield = windshield;
	}
	
	public boolean isAcHeat() 
	{
		return acHeat;
	}
	
	public void setAcHeat(boolean acHeat) 
	{
		this.acHeat = acHeat;
	}
	
	public boolean isTires() 
	{
		return tires;
	}
	
	public void setTires(boolean tires) 
	{
		this.tires = tires;
	}
	
	public boolean isCrashworthy() 
	{
		return crashworthy;
	}
	
	public void setCrashworthy(boolean crashworthy) 
	{
		this.crashworthy = crashworthy;
	}
	
	public boolean isPortOx() 
	{
		return portOx;
	}
	
	public void setPortOx(boolean portOx) 
	{
		this.portOx = portOx;
	}
	
	public boolean isObOx() 
	{
		return obOx;
	}
	
	public void setObOx(boolean obOx) 
	{
		this.obOx = obOx;
	}
	
	public boolean isPortSuction() 
	{
		return portSuction;
	}
	
	public void setPortSuction(boolean portSuction) 
	{
		this.portSuction = portSuction;
	}
	
	public boolean isObSuction() 
	{
		return obSuction;
	}
	
	public void setObSuction(boolean obSuction) 
	{
		this.obSuction = obSuction;
	}
	
	public boolean isStretcher() 
	{
		return stretcher;
	}
	
	public void setStretcher(boolean stretcher) 
	{
		this.stretcher = stretcher;
	}
	
	public boolean isAlsEquip() 
	{
		return alsEquip;
	}
	
	public void setAlsEquip(boolean alsEquip) 
	{
		this.alsEquip = alsEquip;
	}
	
	public boolean isVehMarks() 
	{
		return vehMarks;
	}
	
	public void setVehMarks(boolean vehMarks) 
	{
		this.vehMarks = vehMarks;
	}
	
	public boolean isAed() 
	{
		return aed;
	}
	
	public void setAed(boolean aed) 
	{
		this.aed = aed;
	}
	
	public boolean isRadio() 
	{
		return radio;
	}
	
	public void setRadio(boolean radio) 
	{
		this.radio = radio;
	}
	
	public boolean isOxRetent() 
	{
		return oxRetent;
	}
	
	public void setOxRetent(boolean oxRetent) 
	{
		this.oxRetent = oxRetent;
	}
	
	public boolean isAirbag() 
	{
		return airbag;
	}
	
	public void setAirbag(boolean airbag) 
	{
		this.airbag = airbag;
	}
	
	public boolean isSmoking() 
	{
		return smoking;
	}
	
	public void setSmoking(boolean smoking) 
	{
		this.smoking = smoking;
	}
	
	public boolean isLatches() 
	{
		return latches;
	}
	
	public void setLatches(boolean latches) 
	{
		this.latches = latches;
	}
	
	public boolean isBbp() 
	{
		return bbp;
	}
	
	public void setBbp(boolean bbp) 
	{
		this.bbp = bbp;
	}
	
	public boolean isLift() 
	{
		return lift;
	}
	
	public void setLift(boolean lift) 
	{
		this.lift = lift;
	}
	
	public boolean isUnsVeh() 
	{
		return unsVeh;
	}
	
	public void setUnsVeh(boolean unsVeh) 
	{
		this.unsVeh = unsVeh;
	}
	
	public boolean isUniform() 
	{
		return uniform;
	}
	
	public void setUniform(boolean uniform) 
	{
		this.uniform = uniform;
	}
	
	public boolean isExpMeds() 
	{
		return expMeds;
	}
	
	public void setExpMeds(boolean expMeds) 
	{
		this.expMeds = expMeds;
	}
	
	public boolean isReqEquip() 
	{
		return reqEquip;
	}
	
	public void setReqEquip(boolean reqEquip) 
	{
		this.reqEquip = reqEquip;
	}
	
	public boolean isLicPlate()
	{
		return licPlate;
	}
	
	public void setLicPlate(boolean licPlate) 
	{
		this.licPlate = licPlate;
	}
	
	public boolean isOther() 
	{
		return other;
	}
	
	public void setOther(boolean other) 
	{
		this.other = other;
	}
	
	public String getSpecOther() 
	{
		return specOther;
	}
	
	public void setSpecOther(String specOther) 
	{
		this.specOther = specOther;
	}
	
	public boolean isWarning() 
	{
		return warning;
	}
	
	public void setWarning(boolean warning) 
	{
		this.warning = warning;
	}

	public String getEntryBy() 
	{
		return entryBy;
	}

	public void setEntryBy(String entryBy) 
	{
		this.entryBy = entryBy;
	}

	public String getEntryDate() 
	{
		return entryDate;
	}

	public void setEntryDate(String entryDate) 
	{
		this.entryDate = entryDate;
	}
}
