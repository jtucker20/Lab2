package edu.mcdaniel.java2206.lab2.gravity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class is a simple structure to allow you to do your work during the semester.
 * That is, if you want to do an assignment, copy this code, make a new class with the
 * name of your class, paste this code in there and change the class and constructor
 * names to your class, add a reference to your new class and it's major functions in
 * the Application class and then do your coding here.
 */
public class GravityBaseClass {

    //=============================================================================================
    // Private Assets
    //=============================================================================================

    /**
     * This provides access to logging.
     */
    private final Logger log;

    private double g;
    private double h;
    private double t;


    //=============================================================================================
    // Constructor(s)
    //=============================================================================================

    /**
     * This No Argument constructor is designed to initialize the greeting to the standard
     * "Hello World."
     */
    public GravityBaseClass(){
        log = LogManager.getLogger(this);
        g = 0;
        h = 0;
        t = 0;
    }

    public GravityBaseClass(double gravityAccel, double height){
        log = LogManager.getLogger(this);
        g = gravityAccel;
        h = height;
        t = 0;
    }


    //=============================================================================================
    // Major Methods
    //=============================================================================================

    public void caluclateT(){
        if(this.h > 0 && this.g > 0){
            this.t = Math.sqrt( (2.0 * h) / g);
        }
    }


    //=============================================================================================
    // Minor Methods(s)
    //=============================================================================================



    //=============================================================================================
    // Getters and Setters
    //=============================================================================================


    public double getG() {
        return g;
    }

    public void setG(double g) {
        this.g = g;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }
}
