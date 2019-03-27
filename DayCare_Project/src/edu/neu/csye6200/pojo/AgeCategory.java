package edu.neu.csye6200.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="age_category")
@Table(name="age_category")

public enum AgeCategory {
	

    SIX_TWELVE(1), THIRTEEN_TWENTYFOUR(2), TWENTYFIVE_THIRTYFIVE(3), THIRTYSIX_FORTYSEVEN(4), FORTYEIGHT_FIFTYNINE(5), SIXTY_AND_ABOVE(6); 
  
    private int category; 
  
 
    public int getCategory() 
    { 
        return this.category; 
    } 
  
    private AgeCategory(int category) 
    { 
        this.category = category; 
    } 
    
    @OneToOne(mappedBy="age_category", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Classroom classroom;
}
