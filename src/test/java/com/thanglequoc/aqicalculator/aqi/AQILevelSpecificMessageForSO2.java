package com.thanglequoc.aqicalculator.aqi;

public enum AQILevelSpecificMessageForSO2 {
    GOOD("",""),
    MODERATE("",""),
    UNHEALTHY_FOR_SENSITIVE_GROUPS("",""),
    UNHEALTHY("",""),
    VERY_UNHEALTHY("",""),
    HAZARDOUS("","");
    
    private String healthEffectsStatements;
    private String guidance;
    
    
    AQILevelSpecificMessageForSO2(String healthEffectsStatements, String guidance){
	this.healthEffectsStatements = healthEffectsStatements;
	this.guidance = guidance;
    }
    
    public String getHealthEffectsStatements(){
	return healthEffectsStatements;
    }
    
    public String getGuidance(){
	return guidance;
    }
}