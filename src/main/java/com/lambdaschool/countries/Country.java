package com.lambdaschool.countries;

import java.util.concurrent.atomic.AtomicLong;

public class Country
{
   private static final AtomicLong counter = new AtomicLong();
   private long id;
   private String name;
   private long population;
   private long landMass;
   private int medianAge;

   public Country(long id, String name, long population, long landMass, int medianAge) {
      this.id = counter.incrementAndGet();
      this.name = name;
      this.population = population;
      this.landMass = landMass;
      this.medianAge = medianAge;
   }

   public long getId() {
      return id;
   }

   public void setId(long id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public long getPopulation() {
      return population;
   }

   public void setPopulation(long population) {
      this.population = population;
   }

   public long getLandMass() {
      return landMass;
   }

   public void setLandMass(long landMass) {
      this.landMass = landMass;
   }

   public int getMedianAge() {
      return medianAge;
   }

   public void setMedianAge(int medianAge) {
      this.medianAge = medianAge;
   }
}
