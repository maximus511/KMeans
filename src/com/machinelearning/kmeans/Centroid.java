package com.machinelearning.kmeans;

import java.util.ArrayList;

/**
 * Class representing a cluster
 * @author Rahul
 *
 */
public class Centroid {
	
	String[] centroidAttributes = new String[5];
	ArrayList<String[]> cluster = new ArrayList<String[]>();
		
	public String[] getCentroidAttributes() {
		return centroidAttributes;
	}
	public void setCentroidAttributes(String[] centroidAttributes) {
		this.centroidAttributes = centroidAttributes;
	}
	public ArrayList<String[]> getCluster() {
		return cluster;
	}
	public void setCluster(ArrayList<String[]> cluster) {
		this.cluster = cluster;
	}

}
