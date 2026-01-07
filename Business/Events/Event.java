/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Events;

/**
 *
 * @author nanaabena
 */

public class Event {
    private String name;
    private String dateTime;
    private String venue;
    private String audience;

    // Constructor
    public Event(String name, String dateTime, String venue, String audience) {
        this.name = name;
        this.dateTime = dateTime;
        this.venue = venue;
        this.audience = audience;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    @Override
    public String toString() {
        return "Event{name='" + name + "', dateTime='" + dateTime + "', venue='" + venue + "', audience='" + audience + "'}";
    }
}
